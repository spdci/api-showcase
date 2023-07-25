package2_path=$(pwd)/package2

cd $package2_path/auth-service
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for auth-service'

cd $package2_path/national-gateway
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for national-gateway'

cd $package2_path/service-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for service-registry'

