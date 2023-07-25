package3_path=$(pwd)/package3

cd $package3_path/connector-data-systems
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-data-systems'

cd $package3_path/connector-disability-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-disability-registry'

cd $package3_path/connector-farmer-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-farmer-registry'

cd $package3_path/connector-mosip
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-mosip'

cd $package3_path/connector-payment
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-payment'


cd $package3_path/connector-university-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-university-registry'


cd $package3_path/connector-student-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-student-registry'

cd $package3_path/connector-social-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-social-registry'