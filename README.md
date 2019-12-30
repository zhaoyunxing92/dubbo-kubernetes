# dubbo-kubernetes
k8s中的dubbo

## provider package

mvn clean package -pl dubbo-kubernetes-server/dubbo-provider-sample/ -am -Dchangelist=1.0

cd dubbo-kubernetes-server/dubbo-provider-sample 

mvn -Dchanglist=1.0 docker:build -DpushImage

## consumer package

mvn clean package -pl dubbo-kubernetes-server/dubbo-consumer-sample/ -am -Dchanglist=1.0

cd dubbo-kubernetes-server/dubbo-consumer-sample/

mvn -Dchanglist=1.0 docker:build -DpushImage