import pandas as pd
from sklearn.impute import SimpleImputer
from sklearn.preprocessing import StandardScaler
from scipy.io import arff

# Load dataset
file_path = r'C:\Users\madha\Downloads\breast.cancer.arff'
data, meta = arff.loadarff(file_path)

# Convert to DataFrame
df = pd.DataFrame(data)

# Handling missing values
imputer = SimpleImputer(strategy='mean')
data_clean = pd.DataFrame(imputer.fit_transform(df), columns=df.columns)

# Normalization
scaler = StandardScaler()
data_normalized = pd.DataFrame(scaler.fit_transform(data_clean), columns=data_clean.columns)

# Save preprocessed data
data_normalized.to_csv('Cancer_preprocessed.csv', index=False)
