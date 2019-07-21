(ns net.minecraftforge.fml.client.config.DummyConfigElement
  "This class's main purpose is to provide the necessary objects for a sample Config GUI for FML, although
  there may be practical uses for the objects defined here such as using the DummyCategoryElement object as a
  wrapper for a custom IGuiConfigListEntry object that opens a special screen."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config DummyConfigElement]))

(defn ->dummy-config-element
  "Constructor.

  name - `java.lang.String`
  default-value - `java.lang.Object`
  type - `net.minecraftforge.fml.client.config.ConfigGuiType`
  lang-key - `java.lang.String`
  valid-values - `java.lang.String[]`
  valid-string-pattern - `java.util.regex.Pattern`
  min-value - `java.lang.Object`
  max-value - `java.lang.Object`"
  (^DummyConfigElement [^java.lang.String name ^java.lang.Object default-value ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key valid-values ^java.util.regex.Pattern valid-string-pattern ^java.lang.Object min-value ^java.lang.Object max-value]
    (new DummyConfigElement name default-value type lang-key valid-values valid-string-pattern min-value max-value))
  (^DummyConfigElement [^java.lang.String name ^java.lang.Object default-value ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key ^java.lang.Object min-value ^java.lang.Object max-value]
    (new DummyConfigElement name default-value type lang-key min-value max-value))
  (^DummyConfigElement [^java.lang.String name ^java.lang.Object default-value ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key ^java.util.regex.Pattern valid-string-pattern]
    (new DummyConfigElement name default-value type lang-key valid-string-pattern))
  (^DummyConfigElement [^java.lang.String name ^java.lang.Object default-value ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key]
    (new DummyConfigElement name default-value type lang-key)))

(defn get-config-entry-class
  "Description copied from interface: IConfigElement

  returns: `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry>`"
  ([^DummyConfigElement this]
    (-> this (.getConfigEntryClass))))

(defn get-array-entry-class
  "Description copied from interface: IConfigElement

  returns: `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiEditArrayEntries$IArrayEntry>`"
  ([^DummyConfigElement this]
    (-> this (.getArrayEntryClass))))

(defn set-requires-mc-restart
  "requires-mc-restart - `boolean`

  returns: `net.minecraftforge.fml.client.config.IConfigElement`"
  (^net.minecraftforge.fml.client.config.IConfigElement [^DummyConfigElement this ^Boolean requires-mc-restart]
    (-> this (.setRequiresMcRestart requires-mc-restart))))

(defn get-type
  "Description copied from interface: IConfigElement

  returns: `net.minecraftforge.fml.client.config.ConfigGuiType`"
  (^net.minecraftforge.fml.client.config.ConfigGuiType [^DummyConfigElement this]
    (-> this (.getType))))

(defn get-defaults
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object[]`"
  ([^DummyConfigElement this]
    (-> this (.getDefaults))))

(defn get-min-value
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^DummyConfigElement this]
    (-> this (.getMinValue))))

(defn requires-mc-restart
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^DummyConfigElement this]
    (-> this (.requiresMcRestart))))

(defn get-valid-values
  "Description copied from interface: IConfigElement

  returns: `java.lang.String[]`"
  ([^DummyConfigElement this]
    (-> this (.getValidValues))))

(defn list?
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^DummyConfigElement this]
    (-> this (.isList))))

(defn get-max-value
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^DummyConfigElement this]
    (-> this (.getMaxValue))))

(defn get-name
  "Description copied from interface: IConfigElement

  returns: `java.lang.String`"
  (^java.lang.String [^DummyConfigElement this]
    (-> this (.getName))))

(defn set-custom-list-entry-class
  "clazz - `java.lang.Class`

  returns: `net.minecraftforge.fml.client.config.DummyConfigElement`"
  (^net.minecraftforge.fml.client.config.DummyConfigElement [^DummyConfigElement this ^java.lang.Class clazz]
    (-> this (.setCustomListEntryClass clazz))))

(defn get-default
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^DummyConfigElement this]
    (-> this (.getDefault))))

(defn show-in-gui
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^DummyConfigElement this]
    (-> this (.showInGui))))

(defn requires-world-restart
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^DummyConfigElement this]
    (-> this (.requiresWorldRestart))))

(defn list-length-fixed?
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^DummyConfigElement this]
    (-> this (.isListLengthFixed))))

(defn get-child-elements
  "Description copied from interface: IConfigElement

  returns: `java.util.List<net.minecraftforge.fml.client.config.IConfigElement>`"
  (^java.util.List [^DummyConfigElement this]
    (-> this (.getChildElements))))

(defn get-comment
  "Description copied from interface: IConfigElement

  returns: `java.lang.String`"
  (^java.lang.String [^DummyConfigElement this]
    (-> this (.getComment))))

(defn get-validation-pattern
  "Description copied from interface: IConfigElement

  returns: `java.util.regex.Pattern`"
  (^java.util.regex.Pattern [^DummyConfigElement this]
    (-> this (.getValidationPattern))))

(defn get-list
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object[]`"
  ([^DummyConfigElement this]
    (-> this (.getList))))

(defn get-qualified-name
  "Description copied from interface: IConfigElement

  returns: `java.lang.String`"
  (^java.lang.String [^DummyConfigElement this]
    (-> this (.getQualifiedName))))

(defn set-array-entry-class
  "clazz - `java.lang.Class`

  returns: `net.minecraftforge.fml.client.config.IConfigElement`"
  (^net.minecraftforge.fml.client.config.IConfigElement [^DummyConfigElement this ^java.lang.Class clazz]
    (-> this (.setArrayEntryClass clazz))))

(defn get-language-key
  "Description copied from interface: IConfigElement

  returns: `java.lang.String`"
  (^java.lang.String [^DummyConfigElement this]
    (-> this (.getLanguageKey))))

(defn set
  "Description copied from interface: IConfigElement

  value - `java.lang.Object`"
  ([^DummyConfigElement this ^java.lang.Object value]
    (-> this (.set value))))

(defn set-requires-world-restart
  "requires-world-restart - `boolean`

  returns: `net.minecraftforge.fml.client.config.IConfigElement`"
  (^net.minecraftforge.fml.client.config.IConfigElement [^DummyConfigElement this ^Boolean requires-world-restart]
    (-> this (.setRequiresWorldRestart requires-world-restart))))

(defn get-max-list-length
  "Description copied from interface: IConfigElement

  returns: `int`"
  (^Integer [^DummyConfigElement this]
    (-> this (.getMaxListLength))))

(defn set-to-default
  "Description copied from interface: IConfigElement"
  ([^DummyConfigElement this]
    (-> this (.setToDefault))))

(defn property?
  "Gets the value of the property property.

  returns: `boolean`"
  (^Boolean [^DummyConfigElement this]
    (-> this (.isProperty))))

(defn set-config-entry-class
  "clazz - `java.lang.Class`

  returns: `net.minecraftforge.fml.client.config.IConfigElement`"
  (^net.minecraftforge.fml.client.config.IConfigElement [^DummyConfigElement this ^java.lang.Class clazz]
    (-> this (.setConfigEntryClass clazz))))

(defn get
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^DummyConfigElement this]
    (-> this (.get))))

(defn default?
  "Description copied from interface: IConfigElement

  returns: `boolean`"
  (^Boolean [^DummyConfigElement this]
    (-> this (.isDefault))))

