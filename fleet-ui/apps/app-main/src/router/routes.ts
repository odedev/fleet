import type { RouteRecordRaw } from "vue-router";

import { routes as metadataRoutes } from "@fleet/core-metadata";
import { routes as assetRoutes } from "@fleet/core-asset";
import { routes as systemRoutes } from "@fleet/core-system";
import { routes as developRoutes } from "@fleet/tool-develop";

const routes: RouteRecordRaw[] = [
  ...metadataRoutes,
  ...assetRoutes,
  ...systemRoutes,
  ...developRoutes,
];

export default routes;
