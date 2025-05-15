import pandas as pd 

def load_data(filepath):
    try:
        data = pd.read_csv(filepath)
        print("Data Loaded Successfully!")
        return data
    except Exception as e:
        print(f"Error Loading data")
        return None
    
pddata = load_data("C:/Users/faisa/Documents/0_Programs/sem-6/bigData_lab/data.csv")
if pddata is not None:
    print(pddata.head())