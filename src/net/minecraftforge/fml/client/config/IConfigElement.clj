(ns net.minecraftforge.fml.client.config.IConfigElement
  "This interface provides the information needed by GuiConfig and GuiConfigEntries to display config elements for editing."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config IConfigElement]))

(defn get-config-entry-class
  "This method returns a class that implements GuiConfigEntries.IConfigEntry or null. This class MUST
   provide a constructor with the following parameter types: GuiConfig, GuiConfigEntries, IConfigElement

  returns: `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry>`"
  ([^IConfigElement this]
    (-> this (.getConfigEntryClass))))

(defn get-array-entry-class
  "This method returns a class that implements GuiEditArrayEntries.IArrayEntry. This class MUST provide a constructor with the
   following parameter types: GuiEditArray, GuiEditArrayEntries, IConfigElement, Object

  returns: `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiEditArrayEntries$IArrayEntry>`"
  ([^IConfigElement this]
    (-> this (.getArrayEntryClass))))

(defn get-type
  "[Property, Category] Gets the ConfigGuiType value corresponding to the type of this property object, or CONFIG_CATEGORY if this is a
   category object.

  returns: `net.minecraftforge.fml.client.config.ConfigGuiType`"
  (^net.minecraftforge.fml.client.config.ConfigGuiType [^IConfigElement this]
    (-> this (.getType))))

(defn get-defaults
  "[Property] Gets this property's default values.

  returns: `java.lang.Object[]`"
  ([^IConfigElement this]
    (-> this (.getDefaults))))

(defn get-min-value
  "[Property] Gets this property's minimum value.

  returns: `java.lang.Object`"
  (^java.lang.Object [^IConfigElement this]
    (-> this (.getMinValue))))

(defn requires-mc-restart
  "[Property, Category] Whether or not this element requires Minecraft to be restarted when changed.

  returns: `boolean`"
  (^Boolean [^IConfigElement this]
    (-> this (.requiresMcRestart))))

(defn get-valid-values
  "[Property] Gets a String array of valid values for this property. This is generally used for String properties to allow the user to
   select a value from a list of valid values.

  returns: `java.lang.String[]`"
  ([^IConfigElement this]
    (-> this (.getValidValues))))

(defn list?
  "[Property] Is this property object a list?

  returns: `boolean`"
  (^Boolean [^IConfigElement this]
    (-> this (.isList))))

(defn get-max-value
  "[Property] Gets this property's maximum value.

  returns: `java.lang.Object`"
  (^java.lang.Object [^IConfigElement this]
    (-> this (.getMaxValue))))

(defn get-name
  "[Property, Category] Gets the name of this object.

  returns: `java.lang.String`"
  (^java.lang.String [^IConfigElement this]
    (-> this (.getName))))

(defn get-default
  "[Property] Gets this property's default value. If this element is an array, this method should return a String
   representation of that array using Arrays.toString()

  returns: `java.lang.Object`"
  (^java.lang.Object [^IConfigElement this]
    (-> this (.getDefault))))

(defn show-in-gui
  "[Property, Category] Whether or not this element should be allowed to show on config GUIs.

  returns: `boolean`"
  (^Boolean [^IConfigElement this]
    (-> this (.showInGui))))

(defn requires-world-restart
  "[Property, Category] Whether or not this element is safe to modify while a world is running. For Categories return false if ANY properties
   in the category are modifiable while a world is running, true if all are not.

  returns: `boolean`"
  (^Boolean [^IConfigElement this]
    (-> this (.requiresWorldRestart))))

(defn list-length-fixed?
  "[Property] Does this list property have to remain a fixed length?

  returns: `boolean`"
  (^Boolean [^IConfigElement this]
    (-> this (.isListLengthFixed))))

(defn get-child-elements
  "[Category] Gets this category's child categories/properties.

  returns: `java.util.List<net.minecraftforge.fml.client.config.IConfigElement>`"
  (^java.util.List [^IConfigElement this]
    (-> this (.getChildElements))))

(defn get-comment
  "[Property, Category] Gets the comment for this object. Used for the tooltip if getLanguageKey()  \".tooltip\" is not defined in the
   .lang file.

  returns: `java.lang.String`"
  (^java.lang.String [^IConfigElement this]
    (-> this (.getComment))))

(defn get-validation-pattern
  "[Property] Gets a Pattern object used in String property input validation.

  returns: `java.util.regex.Pattern`"
  (^java.util.regex.Pattern [^IConfigElement this]
    (-> this (.getValidationPattern))))

(defn get-list
  "[Property] Gets this property value as a list. Generally you should be sure of whether the property is a list before calling this.

  returns: `java.lang.Object[]`"
  ([^IConfigElement this]
    (-> this (.getList))))

(defn get-qualified-name
  "[Category] Gets the qualified name of this object. This is typically only used for category objects.

  returns: `java.lang.String`"
  (^java.lang.String [^IConfigElement this]
    (-> this (.getQualifiedName))))

(defn get-language-key
  "[Property, Category] Gets a language key for localization of config GUI entry names. If the same key is specified with .tooltip
   appended to the end, that key will return a localized tooltip when the mouse hovers over the property label/category button.

  returns: `java.lang.String`"
  (^java.lang.String [^IConfigElement this]
    (-> this (.getLanguageKey))))

(defn set
  "[Property] Sets this property's value.

  value - `java.lang.Object`"
  ([^IConfigElement this ^java.lang.Object value]
    (-> this (.set value))))

(defn get-max-list-length
  "[Property] Gets the max length of this list property, or -1 if the length is unlimited.

  returns: `int`"
  (^Integer [^IConfigElement this]
    (-> this (.getMaxListLength))))

(defn set-to-default
  "[Property] Sets this property's value to the default value."
  ([^IConfigElement this]
    (-> this (.setToDefault))))

(defn property?
  "Gets the value of the property property.

  returns: `boolean`"
  (^Boolean [^IConfigElement this]
    (-> this (.isProperty))))

(defn get
  "[Property] Gets this property value.

  returns: `java.lang.Object`"
  (^java.lang.Object [^IConfigElement this]
    (-> this (.get))))

(defn default?
  "[Property] Is this property value equal to the default value?

  returns: `boolean`"
  (^Boolean [^IConfigElement this]
    (-> this (.isDefault))))

