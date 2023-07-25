package1_path=$(pwd)/package1

cd $package1_path/inter-op-layer-receiver
echo $(pwd)
mvn clean package -DskipTests
echo 'Building finished for inter-op-layer-receiver '

