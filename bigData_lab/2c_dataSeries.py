import pandas as pd
import numpy as np

ser = pd.Series()
print("Pandas Series : ",ser)

data = np.array(['F','a','i','s','a','l'])

ser = pd.Series(data)
print("Pandas Series : \n",ser)