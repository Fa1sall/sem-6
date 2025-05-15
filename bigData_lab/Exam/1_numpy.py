import numpy as np

def load_data(filepath):
    try:
        data = np.genfromtxt(filepath,delimiter=',',dtype=None,encoding=None,names=True)
        print("Data loaded successfully!")
        return data
    except Exception as e:
        print(f"Error Loading Data {e}")
        return None

npdata = load_data("C:/Users/faisa/Documents/0_Programs/sem-6/bigData_lab/data.csv")
if npdata is not None:
    print(npdata[1:3])
