

aws eks --region us-east-1 create-cluster --name demoEKSETH2022  --role-arn arn:aws:iam::095423572062:role/eksrole --resources-vpc-config  subnetIds=subnet-07bc9f423a552e9e1,subnet-0880e10961cdedccc,subnet-0cb8c5a7cdab9104d,subnet-0a9baeaed4b844ccf  securityGroupIds=sg-08c3bb4cc62813d81  

aws eks --region us-east-1 create-cluster --name demoEKSETH2022  --role-arn arn:aws:iam::095423572062:role/eksrole --resources-vpc-config  subnetIds=subnet-07bc9f423a552e9e1,subnet-0880e10961cdedccc,subnet-0cb8c5a7cdab9104d,subnet-0a9baeaed4b844ccf 