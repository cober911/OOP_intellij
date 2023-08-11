import json
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
all_values = sheet.get_all_values()
# print(all_values)
# Находим строку, в которой значение "true" в столбце "O"
value_to_find = "true"
found_row = None

for row_idx, row_value in enumerate(sheet.col_values(15), start=1):
    if row_value.lower() == value_to_find:
        found_row = row_idx
        break

if found_row is not None:
    # Получаем значения из найденной строки только для первых 14 столбцов
    row_values = sheet.row_values(found_row, value_render_option="UNFORMATTED_VALUE")[:14]

    # Создаем словарь в формате ключ-значение для найденной строки
    # json_data = {}
    # for col_idx, value in enumerate(row_values, start=1):
    #     header_value = sheet.cell(1, col_idx).value
    #     json_data[header_value] = value
    headers = sheet.row_values(1, value_render_option="UNFORMATTED_VALUE")[:14]
    json_data = dict(zip(headers, row_values))

    # Удаляем значение "true" из столбца "O"
    sheet.update_cell(found_row, 15, "")

    # Записываем данные в JSON-файл
    with open("output.json", "w", encoding="utf-8") as json_file:
        json.dump(json_data, json_file, indent=4, ensure_ascii=False)
else:
    print("Значение 'true' не найдено в столбце 'O'.")