(ns net.minecraftforge.common.config.Property
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.config Property]))

(defn ->property
  "Constructor.

  name - `java.lang.String`
  value - `java.lang.String`
  type - `net.minecraftforge.common.config.Property$Type`
  read - `boolean`
  lang-key - `java.lang.String`"
  (^Property [^java.lang.String name ^java.lang.String value ^net.minecraftforge.common.config.Property$Type type ^Boolean read ^java.lang.String lang-key]
    (new Property name value type read lang-key))
  (^Property [^java.lang.String name ^java.lang.String value ^net.minecraftforge.common.config.Property$Type type ^Boolean read]
    (new Property name value type read))
  (^Property [^java.lang.String name ^java.lang.String value ^net.minecraftforge.common.config.Property$Type type]
    (new Property name value type)))

(defn get-config-entry-class
  "Gets the custom IConfigEntry class that should be used in place of the standard entry class for this Property type, or null if
   none has been set.

  returns: a class that implements IConfigEntry - `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry>`"
  ([^Property this]
    (-> this (.getConfigEntryClass))))

(defn set-max-value
  "Sets the maximum int value of this Property.

  max-value - an int value - `int`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^Integer max-value]
    (-> this (.setMaxValue max-value))))

(defn get-array-entry-class
  "Gets the custom IArrayEntry class that should be used in place of the standard entry class for this Property type, or null if
   none has been set.

  returns: a class that implements IArrayEntry - `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiEditArrayEntries$IArrayEntry>`"
  ([^Property this]
    (-> this (.getArrayEntryClass))))

(defn long-value?
  "Checks if the current value stored in this property can be converted to a long.

  returns: True if the type of the Property is an Long - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isLongValue))))

(defn set-requires-mc-restart
  "Sets whether or not this Property requires Minecraft to be restarted when changed.
   Defaults to false. Setting this flag to true will also disable editing of
   this property while a world is running.

  requires-mc-restart - `boolean`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^Boolean requires-mc-restart]
    (-> this (.setRequiresMcRestart requires-mc-restart))))

(defn get-type
  "Gets the Property.Type enum value for this Property.

  returns: the Property's type - `net.minecraftforge.common.config.Property$Type`"
  (^net.minecraftforge.common.config.Property$Type [^Property this]
    (-> this (.getType))))

(defn boolean-value?
  "Checks if the current value held by this property is a valid boolean value.

  returns: True if it is a boolean value - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isBooleanValue))))

(defn set-comment
  "comment - `java.lang.String`"
  ([^Property this ^java.lang.String comment]
    (-> this (.setComment comment))))

(defn set-min-value
  "Sets the minimum int value of this Property.

  min-value - an int value - `int`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^Integer min-value]
    (-> this (.setMinValue min-value))))

(defn set-validation-pattern
  "Sets a regex Pattern object used to validate user input for formatted String or String[] properties.

  validation-pattern - `java.util.regex.Pattern`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^java.util.regex.Pattern validation-pattern]
    (-> this (.setValidationPattern validation-pattern))))

(defn get-string
  "Returns the value in this property as it's raw string.

  returns: current value - `java.lang.String`"
  (^java.lang.String [^Property this]
    (-> this (.getString))))

(defn get-defaults
  "Gets the raw String[] default values of this Property. Check for isList() == true first.

  returns: the default values String[] - `java.lang.String[]`"
  ([^Property this]
    (-> this (.getDefaults))))

(defn double-list?
  "Checks if all of the current values stored in this property can be converted to a double.

  returns: True if the type of the Property is a double List - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isDoubleList))))

(defn get-min-value
  "Gets the minimum value.

  returns: the minimum value bound - `java.lang.String`"
  (^java.lang.String [^Property this]
    (-> this (.getMinValue))))

(defn set-name
  "Sets the name/key for this Property.

  name - a name - `java.lang.String`"
  ([^Property this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-max-list-length
  "Sets the maximum length of this list/array Property. Only important if isList() == true. If the current values array or default
   values array is longer than the new maximum it will be resized. If calling both this method and setIsListLengthFixed(true), this
   method should be called afterwards (but is not required).

  max - `int`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^Integer max]
    (-> this (.setMaxListLength max))))

(defn requires-mc-restart
  "Gets whether or not this Property requires Minecraft to be restarted when changed.
   Defaults to false unless set to true.

  returns: `boolean`"
  (^Boolean [^Property this]
    (-> this (.requiresMcRestart))))

(defn get-valid-values
  "Gets the array of valid values that this String Property can be set to, or null if not defined.

  returns: a String array of valid values - `java.lang.String[]`"
  ([^Property this]
    (-> this (.getValidValues))))

(defn get-int-list
  "Returns the integer value of all values that can
   be parsed in the list.

  returns: Array of length 0 if none of the values could be parsed. - `int[]`"
  ([^Property this]
    (-> this (.getIntList))))

(defn int-value?
  "Checks if the current value stored in this property can be converted to an integer.

  returns: True if the type of the Property is an Integer - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isIntValue))))

(defn list?
  "Returns whether or not this Property is a list/array.

  returns: true if this Property is a list/array, false otherwise - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isList))))

(defn get-string-list
  "returns: `java.lang.String[]`"
  ([^Property this]
    (-> this (.getStringList))))

(defn get-max-value
  "Gets the maximum value.

  returns: the maximum value bound - `java.lang.String`"
  (^java.lang.String [^Property this]
    (-> this (.getMaxValue))))

(defn get-name
  "Gets the name/key for this Property.

  returns: the Property name - `java.lang.String`"
  (^java.lang.String [^Property this]
    (-> this (.getName))))

(defn get-default
  "Gets the raw String default value of this Property. Check for isList() == false first.

  returns: the default value String - `java.lang.String`"
  (^java.lang.String [^Property this]
    (-> this (.getDefault))))

(defn get-long
  "Returns the value in this property as a long,
   if the value is not a valid long, it will return the
   provided default.

  default - The default to provide if the current value is not a validlong - `long`

  returns: The value - `long`"
  (^Long [^Property this ^Long default]
    (-> this (.getLong default)))
  (^Long [^Property this]
    (-> this (.getLong))))

(defn set-default-values
  "Sets the default String[] values of this Property.

  default-values - an array of String values - `java.lang.String[]`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this default-values]
    (-> this (.setDefaultValues default-values))))

(defn get-boolean-list
  "Returns the boolean value of all values that can
   be parsed in the list.

  returns: Array of length 0 if none of the values could be parsed. - `boolean[]`"
  ([^Property this]
    (-> this (.getBooleanList))))

(defn show-in-gui
  "Gets whether or not this Property should be allowed to show on config GUIs.
   Defaults to true unless set to false.

  returns: `boolean`"
  (^Boolean [^Property this]
    (-> this (.showInGui))))

(defn get-int
  "Returns the value in this property as an integer,
   if the value is not a valid integer, it will return the
   provided default.

  default - The default to provide if the current value is not a valid integer - `int`

  returns: The value - `int`"
  (^Integer [^Property this ^Integer default]
    (-> this (.getInt default)))
  (^Integer [^Property this]
    (-> this (.getInt))))

(defn requires-world-restart
  "Returns whether or not this Property is able to be edited while a world is running using the in-game Mod Options screen
   as well as the Mods list screen, or only from the Mods list screen. Setting this flag to true will disable editing of
   this property while a world is running.

  returns: `boolean`"
  (^Boolean [^Property this]
    (-> this (.requiresWorldRestart))))

(defn set-default-value
  "Sets the default string value of this Property.

  default-value - a String value - `java.lang.String`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^java.lang.String default-value]
    (-> this (.setDefaultValue default-value))))

(defn get-double-list
  "Returns the double value of all values that can
   be parsed in the list.

  returns: Array of length 0 if none of the values could be parsed. - `double[]`"
  ([^Property this]
    (-> this (.getDoubleList))))

(defn list-length-fixed?
  "Returns whether or not this list/array has a fixed length. Only important if isList() == true.

  returns: `boolean`"
  (^Boolean [^Property this]
    (-> this (.isListLengthFixed))))

(defn set-language-key
  "Sets the localization language key for this Property so that the config GUI screens are nice and pretty <3. The string languageKey
   \".tooltip\" is used for tooltips when a user hovers the mouse over a GUI property label.

  lang-key - a string language key such as myawesomemod.config.myPropName - `java.lang.String`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^java.lang.String lang-key]
    (-> this (.setLanguageKey lang-key))))

(defn get-comment
  "returns: `java.lang.String`"
  (^java.lang.String [^Property this]
    (-> this (.getComment))))

(defn get-validation-pattern
  "Gets the Pattern object used to validate user input for this Property.

  returns: the user input validation Pattern object, or null if none is set - `java.util.regex.Pattern`"
  (^java.util.regex.Pattern [^Property this]
    (-> this (.getValidationPattern))))

(defn double-value?
  "Checks if the current value held by this property is a valid double value.

  returns: True if the value can be converted to an double - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isDoubleValue))))

(defn set-values
  "Sets the values of this Property to the provided String[] values.

  values - `java.lang.String[]`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this values]
    (-> this (.setValues values))))

(defn set-value
  "Sets the value of this Property to the provided String value.

  value - `java.lang.String`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^java.lang.String value]
    (-> this (.setValue value))))

(defn has-changed?
  "Gets the changed status of this Property.

  returns: true if this Property has changed, false otherwise - `boolean`"
  (^Boolean [^Property this]
    (-> this (.hasChanged))))

(defn set-array-entry-class
  "Sets a custom IGuiEditListEntry class that should be used in place of the standard entry class for this Property type. This class
   MUST provide a constructor with the following parameter types: GuiEditArray (the owning GuiEditArray screen will be provided),
   GuiEditArrayEntries (the parent GuiEditArrayEntries will be provided), IConfigElement (the IConfigElement for this Property
   will be provided), and Object for the property's value.

  clazz - `java.lang.Class`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^java.lang.Class clazz]
    (-> this (.setArrayEntryClass clazz))))

(defn boolean-list?
  "Checks if all of current values stored in this property can be converted to a boolean.

  returns: True if it is a boolean value - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isBooleanList))))

(defn get-language-key
  "Gets the language key string for this Property.

  returns: the language key - `java.lang.String`"
  (^java.lang.String [^Property this]
    (-> this (.getLanguageKey))))

(defn set
  "value - `java.lang.String`"
  ([^Property this ^java.lang.String value]
    (-> this (.set value))))

(defn get-boolean?
  "Returns the value in this property as a boolean,
   if the value is not a valid boolean, it will return the
   provided default.

  default - The default to provide - `boolean`

  returns: The value as a boolean, or the default - `boolean`"
  (^Boolean [^Property this ^Boolean default]
    (-> this (.getBoolean default)))
  (^Boolean [^Property this]
    (-> this (.getBoolean))))

(defn set-is-list-length-fixed
  "Sets the flag for whether this list/array Property has a fixed length. Only important if isList() == true. If calling both this
   method and setMaxListLength(), this method should be called first (but is not required).

  is-list-length-fixed - `boolean`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^Boolean is-list-length-fixed]
    (-> this (.setIsListLengthFixed is-list-length-fixed))))

(defn int-list?
  "Checks if all of the current values stored in this property can be converted to an integer.

  returns: True if the type of the Property is an Integer List - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isIntList))))

(defn set-requires-world-restart
  "Sets the flag for whether or not this Property can be edited while a world is running. Care should be taken to ensure
   that only properties that are truly dynamic can be changed from the in-game options menu. When set to false the Property will be
   editable from both the main menu Mods list config screen and the in-game Mod Options config screen. When set to true the Property
   will only be editable from the main menu Mods list config screen.

  requires-world-restart - `boolean`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^Boolean requires-world-restart]
    (-> this (.setRequiresWorldRestart requires-world-restart))))

(defn get-max-list-length
  "Gets the maximum length of this list/array Property. Only important if isList() == true.

  returns: `int`"
  (^Integer [^Property this]
    (-> this (.getMaxListLength))))

(defn set-to-default
  "Sets the current value(s) of this Property to the default value(s).

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this]
    (-> this (.setToDefault))))

(defn get-double
  "Returns the value in this property as a double,
   if the value is not a valid double, it will return the
   provided default.

  default - The default to provide if the current value is not a valid double - `double`

  returns: The value - `double`"
  (^Double [^Property this ^Double default]
    (-> this (.getDouble default)))
  (^Double [^Property this]
    (-> this (.getDouble))))

(defn was-read
  "Determines if this config value was just created, or if it was read from the config file.
   This is useful for mods who auto-assign their blocks to determine if the ID returned is
   a configured one, or a automatically generated one.

  returns: True if this property was loaded from the config file with a value - `boolean`"
  (^Boolean [^Property this]
    (-> this (.wasRead))))

(defn set-config-entry-class
  "Sets a custom IConfigEntry class that should be used in place of the standard entry class for this Property type. This class
   MUST provide a constructor with the following parameter types: GuiConfig (the owning GuiConfig screen will be provided),
   GuiConfigEntries (the owning GuiConfigEntries will be provided), IConfigElement (the IConfigElement for this Property
   will be provided).

  clazz - `java.lang.Class`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^java.lang.Class clazz]
    (-> this (.setConfigEntryClass clazz))))

(defn default?
  "Returns whether or not this Property is defaulted.

  returns: true if the current value(s) is(are) deeply equal to the default value(s) - `boolean`"
  (^Boolean [^Property this]
    (-> this (.isDefault))))

(defn set-valid-values
  "Sets the array of valid values that this String Property can be set to. When an array of valid values is defined for a Property the
   GUI control for that property will be a value cycle button.

  valid-values - a String array of valid values - `java.lang.String[]`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this valid-values]
    (-> this (.setValidValues valid-values))))

(defn set-show-in-gui
  "Sets whether or not this Property should be allowed to show on config GUIs.
   Defaults to true.

  show-in-gui - `boolean`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Property this ^Boolean show-in-gui]
    (-> this (.setShowInGui show-in-gui))))

