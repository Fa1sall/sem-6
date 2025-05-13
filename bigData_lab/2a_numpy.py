import numpy as np 
 
def load_data(file_path): 
    try: 
          data = np.genfromtxt(file_path, delimiter=',', dtype=None, encoding=None, names=True) 
          print("Data loaded successfully!") 
          return data 
    except Exception as e: 
         print(f"Error loading data: {e}") 
         return None 

file_path = "C:/Users/faisa/Documents/0_Programs/sem-6/bigData_lab/data.csv"   
data = load_data(file_path) 
if data is not None: 
    print(data[:5]) 