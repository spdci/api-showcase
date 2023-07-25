package1_path=$(pwd)/package1
package2_path=$(pwd)/package2
package3_path=$(pwd)/package3
package4_path=$(pwd)/package4


cd $(pwd)/proto-defination
echo $(pwd)
mvn clean install -DskipTests
echo 'Building finished for proto-defination '

cd $package1_path/inter-op-layer-receiver
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for inter-op-layer-receiver '

#cd $package4_path/UniversityRegistry
#echo $(pwd)
#mvn clean package -DskipTests
#echo 'Building finished for UniversityRegistry'

#cd $package4_path/StudentRegistry
#echo $(pwd)
#mvn clean package -DskipTests
#echo 'Building finished for StudentRegistry'
#

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

cd $package3_path/connector-beneficiary-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-beneficiary-registry'


cd $package3_path/connector-social-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-social-registry'

cd $package3_path/connector-opencrvs
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-opencrvs'


cd $package3_path/connector-crvs-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for connector-crvs-registry'

cd $package4_path/SocialRegistry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for SocialRegistry'

cd $package4_path/FarmerRegistry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for FarmerRegistry'

cd $package4_path/DisabilityRegistry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for DisabilityRegistry'


cd $package4_path/beneficiary-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for beneficiary-registry'


cd $package4_path/crvs-registry
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for crvs-registry'
