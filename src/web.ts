import { WebPlugin } from "@capacitor/core";
import type { SystemBarsPlugin } from "./definitions";

export class SystemBarsWeb extends WebPlugin implements SystemBarsPlugin {
    async hideStatusbar() : Promise<void>
    {
        console.log("Unsupported action in web-browsers.");
        return;
    }

    async showStatusbar() : Promise<void>
    {
        console.log("Unsupported action in web-browsers.");
        return;
    }

    async hideNavigationbar() : Promise<void>
    {
        console.log("Unsupported action in web-browsers.");
        return;
    }

    async showNavigationbar() : Promise<void>
    {
        console.log("Unsupported action in web-browsers.");
        return;
    }
}
