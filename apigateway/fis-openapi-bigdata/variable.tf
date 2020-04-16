variable "region" {  
    default = "us-east-1" 
}

provider "aws" {
  region = "${var.region}"
}

variable "apigateway_version"   { 
    default = "1.0.0"
}

variable "app_name" { 
    default = "bigdata"
    
}

variable "app_environment" { 
    default = "dev"
}

variable "app_company"  {
    default = "fis"
}