(ns net.minecraftforge.common.config.ConfigElement
  "This class bridges the gap between the FML config GUI classes and the Forge Configuration classes."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.config ConfigElement]))

(defn ->config-element
  "Constructor.

  category - `net.minecraftforge.common.config.ConfigCategory`"
  (^ConfigElement [^net.minecraftforge.common.config.ConfigCategory category]
    (new ConfigElement category)))

(defn *get-type
  "prop - `net.minecraftforge.common.config.Property`

  returns: `net.minecraftforge.fml.client.config.ConfigGuiType`"
  (^net.minecraftforge.fml.client.config.ConfigGuiType [^net.minecraftforge.common.config.Property prop]
    (ConfigElement/getType prop)))

(defn get-config-entry-class
  "Description copied from interface: IConfigElement

  returns: `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry>`"
  ([^ConfigElement this]
    (-> this (.getConfigEntryClass))))

(defn get-array-entry-class
  "Description copied from interface: IConfigElement

  returns: `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiEditArrayEntries$IArrayEntry>`"
  ([^ConfigElement this]
    (-> this (.getArrayEntryClass))))

(defn get-type
  "Description copied from interface: IConfigElement

  returns: `net.minecraftforge.fml.client.config.ConfigGuiType`"
  (^net.minecraftforge.fml.client.config.ConfigGuiType [^ConfigElement this]
    (-> this (.getType))))

(defn get-defaults
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object[]`"
  ([^ConfigElement this]
    (-> this (.getDefaults))))

(defn get-min-value
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^ConfigElement this]
    (-> this (.getMinValue))))

(defn requires-mc-restart
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^ConfigElement this]
    (-> this (.requiresMcRestart))))

(defn get-valid-values
  "Description copied from interface: IConfigElement

  returns: `java.lang.String[]`"
  ([^ConfigElement this]
    (-> this (.getValidValues))))

(defn list?
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^ConfigElement this]
    (-> this (.isList))))

(defn get-max-value
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^ConfigElement this]
    (-> this (.getMaxValue))))

(defn get-name
  "Description copied from interface: IConfigElement

  returns: `java.lang.String`"
  (^java.lang.String [^ConfigElement this]
    (-> this (.getName))))

(defn get-default
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^ConfigElement this]
    (-> this (.getDefault))))

(defn show-in-gui
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^ConfigElement this]
    (-> this (.showInGui))))

(defn requires-world-restart
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^ConfigElement this]
    (-> this (.requiresWorldRestart))))

(defn list-length-fixed?
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^ConfigElement this]
    (-> this (.isListLengthFixed))))

(defn get-child-elements
  "Description copied from interface: IConfigElement

  returns: `java.util.List<net.minecraftforge.fml.client.config.IConfigElement>`"
  (^java.util.List [^ConfigElement this]
    (-> this (.getChildElements))))

(defn get-comment
  "Description copied from interface: IConfigElement

  returns: `java.lang.String`"
  (^java.lang.String [^ConfigElement this]
    (-> this (.getComment))))

(defn get-validation-pattern
  "Description copied from interface: IConfigElement

  returns: `java.util.regex.Pattern`"
  (^java.util.regex.Pattern [^ConfigElement this]
    (-> this (.getValidationPattern))))

(defn get-list
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object[]`"
  ([^ConfigElement this]
    (-> this (.getList))))

(defn list-categories-first
  "categories-first - `boolean`

  returns: `net.minecraftforge.common.config.ConfigElement`"
  (^net.minecraftforge.common.config.ConfigElement [^ConfigElement this ^Boolean categories-first]
    (-> this (.listCategoriesFirst categories-first))))

(defn get-qualified-name
  "Description copied from interface: IConfigElement

  returns: `java.lang.String`"
  (^java.lang.String [^ConfigElement this]
    (-> this (.getQualifiedName))))

(defn get-language-key
  "Description copied from interface: IConfigElement

  returns: `java.lang.String`"
  (^java.lang.String [^ConfigElement this]
    (-> this (.getLanguageKey))))

(defn set
  "Description copied from interface: IConfigElement

  value - `java.lang.Object`"
  ([^ConfigElement this ^java.lang.Object value]
    (-> this (.set value))))

(defn get-max-list-length
  "Description copied from interface: IConfigElement

  returns: `int`"
  (^Integer [^ConfigElement this]
    (-> this (.getMaxListLength))))

(defn set-to-default
  "Description copied from interface: IConfigElement"
  ([^ConfigElement this]
    (-> this (.setToDefault))))

(defn property?
  "Gets the value of the property property.

  returns: `boolean`"
  (^Boolean [^ConfigElement this]
    (-> this (.isProperty))))

(defn get
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^ConfigElement this]
    (-> this (.get))))

(defn default?
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^ConfigElement this]
    (-> this (.isDefault))))

