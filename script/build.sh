
cd ..

######## website ########
echo "build website start -------------"

cd website
pnpm install
pnpm run build

rm -rf ../ops/web/website
mkdir ../ops/web/website
cp -rf .output ../ops/web/website
cd ..

if [ $? != 0 ]; then
  echo "build website failed"
  exit 9
fi

echo "build website done -------------"


######## ui ########
echo "build ui start -------------"

cd fleet-ui
pnpm install
# pnpm run build

cd apps/app-main
pnpm run build
cp -rf dist ../ops/web/ui/data
cd ../..

cd ..

if [ $? != 0 ]; then
  echo "build ui failed"
  exit 9
fi

echo "build ui done -------------"


######## app ########
echo "build app start -------------"

mvn clean
mvn install -Dmaven.test.skip
cp -f fleet-app/fleet-app-main/target/fleet-app-main-1.0.0.jar ../ops/app/main/app.jar

if [ $? != 0 ]; then
  echo "build app failed"
  exit 9
fi

echo "build app done -------------"
