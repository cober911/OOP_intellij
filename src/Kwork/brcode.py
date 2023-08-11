import gspread
from oauth2client.service_account import ServiceAccountCredentials
import requests

# Укажите путь к вашему JSON-ключу и ID таблицы
JSON_KEY_FILE = 'client_secret.json'
SPREADSHEET_ID = '1IzOIda2ztqGSlC3LqjvyQw5-dHz4VvYlccxtdkB04UQ'

# Установка авторизации для доступа к Google Таблицам
scope = ["https://spreadsheets.google.com/feeds", "https://www.googleapis.com/auth/spreadsheets",
         "https://www.googleapis.com/auth/drive.file", "https://www.googleapis.com/auth/drive"]
creds = ServiceAccountCredentials.from_json_keyfile_name(JSON_KEY_FILE, scope)
client = gspread.authorize(creds)
spreadsheet = client.open_by_key(SPREADSHEET_ID)
sheet = spreadsheet.get_worksheet(0)  # 0 - индекс листа

# Получение данных из таблицы
data = sheet.get_all_values()

# Проход по строкам и обработка
for row in data[1:]:
    value_in_column_o = row[14]  # Измените на индекс вашего столбца "o"

    if value_in_column_o == 'true':
        # Выполните логику для передачи данных на веб-страницу
        # send_data_to_web_page(row)  # Передайте данные на веб-страницу
        print("true")

def send_data_to_web_page(data_row):
    # Здесь вы можете использовать библиотеку requests для отправки данных на веб-страницу
    # Пример:
    url = "https://your-web-page.com/data-endpoint"
    payload = {"data": data_row}  # Пример формата данных
    response = requests.post(url, json=payload)
    if response.status_code == 200:
        print("Data sent successfully!")
    else:
        print("Failed to send data.")