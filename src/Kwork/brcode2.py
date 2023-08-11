import json
import sys
import time
import gspread
from oauth2client.service_account import ServiceAccountCredentials

# Подключение к Google Sheets
spreadsheet_id = "1IzOIda2ztqGSlC3LqjvyQw5-dHz4VvYlccxtdkB04UQ"
sheet_name = "sheet1"
scope = ["https://spreadsheets.google.com/feeds", "https://www.googleapis.com/auth/drive"]
cred = ServiceAccountCredentials.from_json_keyfile_name("client_secret2.json", scope)
client = gspread.authorize(cred)
sheet = client.open_by_key(spreadsheet_id).worksheet(sheet_name)
# Получение всех значений в таблице
# all_values = sheet.get_all_values()
# print(all_values)

def process_true_value(row_idx):
    # Получаем значения из найденной строки только для первых 14 столбцов
    row_values = sheet.row_values(row_idx, value_render_option="UNFORMATTED_VALUE")[:14]

    # Создаем словарь в формате ключ-значение для найденной строки
    headers = sheet.row_values(1, value_render_option="UNFORMATTED_VALUE")[:14]
    json_data = dict(zip(headers, row_values))

    # Удаляем значение "true" из столбца "O"
    sheet.update_cell(row_idx, 15, "")

    # Записываем данные в JSON-файл
    with open("output.json", "w", encoding="utf-8") as json_file:
        json.dump(json_data, json_file, indent=4, ensure_ascii=False)
print("Script started")
while True:
    # Проверяем столбец "O" на наличие значения "true"
    for row_idx, row_value in enumerate(sheet.col_values(15), start=1):
        if row_value.lower() == "true":
            process_true_value(row_idx)
            break  # Прерываем цикл, чтобы не обрабатывать остальные строки
        elif row_value.lower() == "false":
            sheet.update_cell(row_idx, 15, "")
            sys.exit("Script stop (false).")

    time.sleep(5)  # Задержка в секундах перед следующей итерацией
