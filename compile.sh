dci_common_classes=$(pwd)/dci-common-classes
registry_component=$(pwd)/registry-component
sp_system=$(pwd)/sp-system

cd $dci_common_classes
echo $(pwd)
mvn clean install -DskipTests
echo 'Building finished for dci-common-classes  ---'

cd $sp_system
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for sp_system'

cd $registry_component/auth-service
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for auth-service'

cd $registry_component/national-gateway
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for national-gateway'

cd $registry_component/service-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for service-registry'

cd $registry_component/connector-opencrvs
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-opencrvs'

