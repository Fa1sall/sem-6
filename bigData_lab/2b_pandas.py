import pandas as pd 
 
def load_data(file_path): 
    try: 
        df = pd.read_csv(file_path) 
        print("Data loaded successfully!") 
        return df 
    except Exception as e: 
         print(f"Error loading data: {e}") 
         return None 

file_path = "C:/Users/faisa/Documents/0_Programs/sem-6/bigData_lab/data.csv"  # Change this to your actual file path 
data = load_data(file_path) 
if data is not None: 
   print(data.head())