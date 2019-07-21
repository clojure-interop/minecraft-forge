(ns net.minecraftforge.fml.client.config.GuiConfig
  "This class is the base GuiScreen for all config GUI screens. It can be extended by mods to provide the top-level config screen
  that will be called when the Config button is clicked from the Main Menu Mods list."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiConfig]))

(defn ->gui-config
  "Constructor.

  GuiConfig constructor that will use ConfigChangedEvent when editing is concluded. titleLine2 is specified in this constructor.
   If a non-null value is passed for configID, the OnConfigChanged and PostConfigChanged events will be posted when the Done button is
   pressed if any configElements were changed (includes child screens). If configID is not defined, the events will be posted if the parent
   gui is null or if the parent gui is not an instance of GuiConfig.

  parent-screen - the parent GuiScreen object - `net.minecraft.client.gui.GuiScreen`
  config-elements - a List of IConfigElement objects - `java.util.List`
  mod-id - the mod ID for the mod whose config settings will be edited - `java.lang.String`
  config-id - an identifier that will be passed to the OnConfigChanged and PostConfigChanged events - `java.lang.String`
  all-require-world-restart - send true if all configElements on this screen require a world restart - `boolean`
  all-require-mc-restart - send true if all configElements on this screen require MC to be restarted - `boolean`
  title - the desired title for this screen. For consistency it is recommended that you pass the path of the config file being edited. - `java.lang.String`
  title-line-2 - the desired title second line for this screen. Typically this is used to send the category name of the category currently being edited. - `java.lang.String`"
  (^GuiConfig [^net.minecraft.client.gui.GuiScreen parent-screen ^java.util.List config-elements ^java.lang.String mod-id ^java.lang.String config-id ^Boolean all-require-world-restart ^Boolean all-require-mc-restart ^java.lang.String title ^java.lang.String title-line-2]
    (new GuiConfig parent-screen config-elements mod-id config-id all-require-world-restart all-require-mc-restart title title-line-2))
  (^GuiConfig [^net.minecraft.client.gui.GuiScreen parent-screen ^java.util.List config-elements ^java.lang.String mod-id ^java.lang.String config-id ^Boolean all-require-world-restart ^Boolean all-require-mc-restart ^java.lang.String title]
    (new GuiConfig parent-screen config-elements mod-id config-id all-require-world-restart all-require-mc-restart title))
  (^GuiConfig [^net.minecraft.client.gui.GuiScreen parent-screen ^java.util.List config-elements ^java.lang.String mod-id ^Boolean all-require-world-restart ^Boolean all-require-mc-restart ^java.lang.String title]
    (new GuiConfig parent-screen config-elements mod-id all-require-world-restart all-require-mc-restart title)))

(defn parent-screen
  "Instance Constant.

  A reference to the screen object that created this. Used for navigating between screens.

  type: net.minecraft.client.gui.GuiScreen"
  (^net.minecraft.client.gui.GuiScreen [^GuiConfig this]
    (-> this .-parentScreen)))

(defn title
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GuiConfig this]
    (-> this .-title)))

(defn title-line-2
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^GuiConfig this]
    (-> this .-titleLine2)))

(defn config-elements
  "Instance Constant.

  type: java.util.List<net.minecraftforge.fml.client.config.IConfigElement>"
  (^java.util.List [^GuiConfig this]
    (-> this .-configElements)))

(defn init-entries
  "Instance Constant.

  type: java.util.List<net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry>"
  (^java.util.List [^GuiConfig this]
    (-> this .-initEntries)))

(defn entry-list
  "Instance Field.

  type: net.minecraftforge.fml.client.config.GuiConfigEntries"
  (^net.minecraftforge.fml.client.config.GuiConfigEntries [^GuiConfig this]
    (-> this .-entryList)))

(defn mod-id
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^GuiConfig this]
    (-> this .-modID)))

(defn config-id
  "Instance Constant.

  When set to a non-null value the OnConfigChanged and PostConfigChanged events will be posted when the Done button is pressed
   if any configElements were changed (includes child screens). If not defined, the events will be posted if the parent gui is null
   or if the parent gui is not an instance of GuiConfig.

  type: java.lang.String"
  (^java.lang.String [^GuiConfig this]
    (-> this .-configID)))

(defn is-world-running
  "Instance Constant.

  type: boolean"
  (^Boolean [^GuiConfig this]
    (-> this .-isWorldRunning)))

(defn all-require-world-restart
  "Instance Constant.

  type: boolean"
  (^Boolean [^GuiConfig this]
    (-> this .-allRequireWorldRestart)))

(defn all-require-mc-restart
  "Instance Constant.

  type: boolean"
  (^Boolean [^GuiConfig this]
    (-> this .-allRequireMcRestart)))

(defn needs-refresh
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiConfig this]
    (-> this .-needsRefresh)))

(defn *get-abridged-config-path
  "path - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String path]
    (GuiConfig/getAbridgedConfigPath path)))

(defn init-gui
  ""
  ([^GuiConfig this]
    (-> this (.initGui))))

(defn on-gui-closed
  ""
  ([^GuiConfig this]
    (-> this (.onGuiClosed))))

(defn handle-mouse-input
  "throws: java.io.IOException"
  ([^GuiConfig this]
    (-> this (.handleMouseInput))))

(defn update-screen
  ""
  ([^GuiConfig this]
    (-> this (.updateScreen))))

(defn draw-screen
  "mouse-x - `int`
  mouse-y - `int`
  partial-ticks - `float`"
  ([^GuiConfig this ^Integer mouse-x ^Integer mouse-y ^Float partial-ticks]
    (-> this (.drawScreen mouse-x mouse-y partial-ticks))))

(defn draw-tool-tip
  "string-list - `java.util.List`
  x - `int`
  y - `int`"
  ([^GuiConfig this ^java.util.List string-list ^Integer x ^Integer y]
    (-> this (.drawToolTip string-list x y))))

