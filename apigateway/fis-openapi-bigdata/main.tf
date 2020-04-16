resource "aws_api_gateway_rest_api" "fis-paas-bigdata-apigateway" {
  name        = "fis-paas-bigdata"
  description = "fis-paas-bigdata"
  body        = "${data.template_file.fis-paas-bigdata-apigateway.rendered}"
}

data "template_file" fis-paas-bigdata-apigateway{
  template = "${file("apigate_bigdata.yaml")}"
  
  vars {
    lambda_bigdata_arn      = "arn:aws:lambda:${var.region}:095423572062:function:fis-faas-getmaxnumber"
    region                  = "${var.region}"
    apigateway_version      = "${var.apigateway_version}"
    standar_request_integration = <<EOF
    {
      \"body\" : $input.json('$'),
      \"headers\":{
          #foreach($header in $input.params().header.keySet())
          \"$header\": \"$util.escapeJavaScript($input.params().header.get($header))\" #if($foreach.hasNext),#end
          #end
        },
      \"method\":   \"$context.httpMethod\",
      \"params\": {
        #foreach($param in $input.params().path.keySet())
        \"$param\": \"$util.escapeJavaScript($input.params().path.get($param))\" #if($foreach.hasNext),#end
        #end
      },
      \"query\": {
        #foreach($queryParam in $input.params().querystring.keySet())
        \"$queryParam\": \"$util.escapeJavaScript($input.params().querystring.get($queryParam))\" #if($foreach.hasNext),#end
        #end
      } 
    }
    EOF
  }
}