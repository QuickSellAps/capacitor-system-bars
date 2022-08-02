export interface SystemBarsPlugin {
    hideStatusbar() : Promise<void>;
    showStatusbar() : Promise<void>;

    hideNavigationbar() : Promise<void>;
    showNavigationbar() : Promise<void>;
}
