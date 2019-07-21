(ns net.minecraftforge.common.config.Configuration
  "This class offers advanced configurations capabilities, allowing to provide
  various categories for configuration variables."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.config Configuration]))

(defn ->configuration
  "Constructor.

  Create a configuration file for the file given in parameter.

  file - `java.io.File`"
  (^Configuration [^java.io.File file]
    (new Configuration file))
  (^Configuration [^java.io.File file ^java.lang.String config-version ^Boolean case-sensitive-custom-categories]
    (new Configuration file config-version case-sensitive-custom-categories))
  (^Configuration [^java.io.File file ^java.lang.String config-version]
    (new Configuration file config-version))
  (^Configuration []
    (new Configuration )))

(def *-category-general
  "Static Constant.

  type: java.lang.String"
  Configuration/CATEGORY_GENERAL)

(def *-category-client
  "Static Constant.

  type: java.lang.String"
  Configuration/CATEGORY_CLIENT)

(def *-allowed-chars
  "Static Constant.

  type: java.lang.String"
  Configuration/ALLOWED_CHARS)

(def *-default-encoding
  "Static Constant.

  type: java.lang.String"
  Configuration/DEFAULT_ENCODING)

(def *-category-splitter
  "Static Constant.

  type: java.lang.String"
  Configuration/CATEGORY_SPLITTER)

(def *-new-line
  "Static Constant.

  type: java.lang.String"
  Configuration/NEW_LINE)

(def *-comment-separator
  "Static Constant.

  type: java.lang.String"
  Configuration/COMMENT_SEPARATOR)

(def *-allowed-properties
  "Static Constant.

  type: com.google.common.base.CharMatcher"
  Configuration/allowedProperties)

(defn default-encoding
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Configuration this]
    (-> this .-defaultEncoding)))

(defn is-child
  "Instance Field.

  type: boolean"
  (^Boolean [^Configuration this]
    (-> this .-isChild)))

(defn *enable-global-config
  ""
  ([]
    (Configuration/enableGlobalConfig )))

(defn save
  ""
  ([^Configuration this]
    (-> this (.save))))

(defn set-category-requires-world-restart
  "Sets the flag for whether or not this category can be edited while a world is running. Care should be taken to ensure
   that only properties that are truly dynamic can be changed from the in-game options menu. Only set this flag to
   true if all child properties/categories are unable to be modified while a world is running.

  category - `java.lang.String`
  requires-world-restart - `boolean`

  returns: `net.minecraftforge.common.config.Configuration`"
  (^net.minecraftforge.common.config.Configuration [^Configuration this ^java.lang.String category ^Boolean requires-world-restart]
    (-> this (.setCategoryRequiresWorldRestart category requires-world-restart))))

(defn get-config-file
  "returns: `java.io.File`"
  (^java.io.File [^Configuration this]
    (-> this (.getConfigFile))))

(defn get-defined-config-version
  "returns: `java.lang.String`"
  (^java.lang.String [^Configuration this]
    (-> this (.getDefinedConfigVersion))))

(defn remove-category
  "category - `net.minecraftforge.common.config.ConfigCategory`"
  ([^Configuration this ^net.minecraftforge.common.config.ConfigCategory category]
    (-> this (.removeCategory category))))

(defn load
  ""
  ([^Configuration this]
    (-> this (.load))))

(defn get-string
  "Creates a string property.

  name - Name of the property. - `java.lang.String`
  category - Category of the property. - `java.lang.String`
  default-value - Default value of the property. - `java.lang.String`
  comment - A brief description what the property does. - `java.lang.String`
  lang-key - A language key used for localization of GUIs - `java.lang.String`
  pattern - `java.util.regex.Pattern`

  returns: The value of the new string property. - `java.lang.String`"
  (^java.lang.String [^Configuration this ^java.lang.String name ^java.lang.String category ^java.lang.String default-value ^java.lang.String comment ^java.lang.String lang-key ^java.util.regex.Pattern pattern]
    (-> this (.getString name category default-value comment lang-key pattern)))
  (^java.lang.String [^Configuration this ^java.lang.String name ^java.lang.String category ^java.lang.String default-value ^java.lang.String comment ^java.lang.String lang-key]
    (-> this (.getString name category default-value comment lang-key)))
  (^java.lang.String [^Configuration this ^java.lang.String name ^java.lang.String category ^java.lang.String default-value ^java.lang.String comment]
    (-> this (.getString name category default-value comment))))

(defn move-property
  "Moves a property from one category to another.

  old-category - the category the property currently resides in - `java.lang.String`
  prop-name - the name of the property to move - `java.lang.String`
  new-category - the category the property should be moved to - `java.lang.String`

  returns: true if the old category and property exist, false otherwise - `boolean`"
  (^Boolean [^Configuration this ^java.lang.String old-category ^java.lang.String prop-name ^java.lang.String new-category]
    (-> this (.moveProperty old-category prop-name new-category))))

(defn get-category
  "category - `java.lang.String`

  returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^Configuration this ^java.lang.String category]
    (-> this (.getCategory category))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Configuration this]
    (-> this (.toString))))

(defn add-custom-category-comment
  "category - `java.lang.String`
  comment - `java.lang.String`"
  ([^Configuration this ^java.lang.String category ^java.lang.String comment]
    (-> this (.addCustomCategoryComment category comment))))

(defn get-string-list
  "Creates a string list property.

  name - Name of the property. - `java.lang.String`
  category - Category of the property. - `java.lang.String`
  default-value - Default value of the property. - `java.lang.String[]`
  comment - A brief description what the property does. - `java.lang.String`
  valid-values - `java.lang.String[]`
  lang-key - `java.lang.String`

  returns: The value of the new string property. - `java.lang.String[]`"
  ([^Configuration this ^java.lang.String name ^java.lang.String category default-value ^java.lang.String comment valid-values ^java.lang.String lang-key]
    (-> this (.getStringList name category default-value comment valid-values lang-key)))
  ([^Configuration this ^java.lang.String name ^java.lang.String category default-value ^java.lang.String comment valid-values]
    (-> this (.getStringList name category default-value comment valid-values)))
  ([^Configuration this ^java.lang.String name ^java.lang.String category default-values ^java.lang.String comment]
    (-> this (.getStringList name category default-values comment))))

(defn rename-property
  "Renames a property in a given category.

  category - the category in which the property resides - `java.lang.String`
  old-prop-name - the existing property name - `java.lang.String`
  new-prop-name - the new property name - `java.lang.String`

  returns: true if the category and property exist, false otherwise - `boolean`"
  (^Boolean [^Configuration this ^java.lang.String category ^java.lang.String old-prop-name ^java.lang.String new-prop-name]
    (-> this (.renameProperty category old-prop-name new-prop-name))))

(defn get-int
  "Creates a integer property.

  name - Name of the property. - `java.lang.String`
  category - Category of the property. - `java.lang.String`
  default-value - Default value of the property. - `int`
  min-value - Minimum value of the property. - `int`
  max-value - Maximum value of the property. - `int`
  comment - A brief description what the property does. - `java.lang.String`
  lang-key - A language key used for localization of GUIs - `java.lang.String`

  returns: The value of the new integer property. - `int`"
  (^Integer [^Configuration this ^java.lang.String name ^java.lang.String category ^Integer default-value ^Integer min-value ^Integer max-value ^java.lang.String comment ^java.lang.String lang-key]
    (-> this (.getInt name category default-value min-value max-value comment lang-key)))
  (^Integer [^Configuration this ^java.lang.String name ^java.lang.String category ^Integer default-value ^Integer min-value ^Integer max-value ^java.lang.String comment]
    (-> this (.getInt name category default-value min-value max-value comment))))

(defn set-category-property-order
  "Sets the order that direct child properties of this config category will be written to the config file and will be displayed in
   config GUIs.

  category - `java.lang.String`
  prop-order - `java.util.List`

  returns: `net.minecraftforge.common.config.Configuration`"
  (^net.minecraftforge.common.config.Configuration [^Configuration this ^java.lang.String category ^java.util.List prop-order]
    (-> this (.setCategoryPropertyOrder category prop-order))))

(defn set-category-config-entry-class
  "Sets the custom IConfigEntry class that should be used in place of the standard entry class (which is just a button that
   navigates into the category). This class MUST provide a constructor with the following parameter types: GuiConfig (the parent
   GuiConfig screen will be provided), GuiConfigEntries (the parent GuiConfigEntries will be provided), IConfigElement
   (the IConfigElement for this Property will be provided).

  category - `java.lang.String`
  clazz - `java.lang.Class`

  returns: `net.minecraftforge.common.config.Configuration`"
  (^net.minecraftforge.common.config.Configuration [^Configuration this ^java.lang.String category ^java.lang.Class clazz]
    (-> this (.setCategoryConfigEntryClass category clazz))))

(defn has-category?
  "category - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Configuration this ^java.lang.String category]
    (-> this (.hasCategory category))))

(defn has-changed?
  "returns: `boolean`"
  (^Boolean [^Configuration this]
    (-> this (.hasChanged))))

(defn set-category-comment
  "Adds a comment to the specified ConfigCategory object

  category - the config category - `java.lang.String`
  comment - a String comment - `java.lang.String`

  returns: `net.minecraftforge.common.config.Configuration`"
  (^net.minecraftforge.common.config.Configuration [^Configuration this ^java.lang.String category ^java.lang.String comment]
    (-> this (.setCategoryComment category comment))))

(defn get-category-names
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^Configuration this]
    (-> this (.getCategoryNames))))

(defn set-category-requires-mc-restart
  "Sets whether or not this ConfigCategory requires Minecraft to be restarted when changed.
   Defaults to false. Only set this flag to true if ALL child properties/categories require
   Minecraft to be restarted when changed. Setting this flag will also prevent modification
   of the child properties/categories while a world is running.

  category - `java.lang.String`
  requires-mc-restart - `boolean`

  returns: `net.minecraftforge.common.config.Configuration`"
  (^net.minecraftforge.common.config.Configuration [^Configuration this ^java.lang.String category ^Boolean requires-mc-restart]
    (-> this (.setCategoryRequiresMcRestart category requires-mc-restart))))

(defn get-boolean?
  "Creates a boolean property.

  name - Name of the property. - `java.lang.String`
  category - Category of the property. - `java.lang.String`
  default-value - Default value of the property. - `boolean`
  comment - A brief description what the property does. - `java.lang.String`
  lang-key - A language key used for localization of GUIs - `java.lang.String`

  returns: The value of the new boolean property. - `boolean`"
  (^Boolean [^Configuration this ^java.lang.String name ^java.lang.String category ^Boolean default-value ^java.lang.String comment ^java.lang.String lang-key]
    (-> this (.getBoolean name category default-value comment lang-key)))
  (^Boolean [^Configuration this ^java.lang.String name ^java.lang.String category ^Boolean default-value ^java.lang.String comment]
    (-> this (.getBoolean name category default-value comment))))

(defn has-key?
  "category - `java.lang.String`
  key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^Configuration this ^java.lang.String category ^java.lang.String key]
    (-> this (.hasKey category key))))

(defn set-category-language-key
  "Adds a language key to the specified ConfigCategory object

  category - the config category - `java.lang.String`
  lang-key - a language key string such as configcategory.general - `java.lang.String`

  returns: `net.minecraftforge.common.config.Configuration`"
  (^net.minecraftforge.common.config.Configuration [^Configuration this ^java.lang.String category ^java.lang.String lang-key]
    (-> this (.setCategoryLanguageKey category lang-key))))

(defn get-float
  "Creates a float property.

  name - Name of the property. - `java.lang.String`
  category - Category of the property. - `java.lang.String`
  default-value - Default value of the property. - `float`
  min-value - Minimum value of the property. - `float`
  max-value - Maximum value of the property. - `float`
  comment - A brief description what the property does. - `java.lang.String`
  lang-key - A language key used for localization of GUIs - `java.lang.String`

  returns: The value of the new float property. - `float`"
  (^Float [^Configuration this ^java.lang.String name ^java.lang.String category ^Float default-value ^Float min-value ^Float max-value ^java.lang.String comment ^java.lang.String lang-key]
    (-> this (.getFloat name category default-value min-value max-value comment lang-key)))
  (^Float [^Configuration this ^java.lang.String name ^java.lang.String category ^Float default-value ^Float min-value ^Float max-value ^java.lang.String comment]
    (-> this (.getFloat name category default-value min-value max-value comment))))

(defn get-loaded-config-version
  "returns: `java.lang.String`"
  (^java.lang.String [^Configuration this]
    (-> this (.getLoadedConfigVersion))))

(defn copy-category-props
  "Copies property objects from another Configuration object to this one using the list of category names. Properties that only exist in the
   \"from\" object are ignored. Pass null for the ctgys array to include all categories.

  from-config - `net.minecraftforge.common.config.Configuration`
  ctgys - `java.lang.String[]`"
  ([^Configuration this ^net.minecraftforge.common.config.Configuration from-config ctgys]
    (-> this (.copyCategoryProps from-config ctgys))))

(defn get
  "Gets an integer array Property object with all settings defined.

  category - the config category - `java.lang.String`
  key - the Property key value - `java.lang.String`
  default-values - an array containing the default values - `int[]`
  comment - a String comment - `java.lang.String`
  min-value - minimum boundary - `int`
  max-value - maximum boundary - `int`
  is-list-length-fixed - boolean for whether this array is required to be a specific length (defined by the default value array length or maxListLength) - `boolean`
  max-list-length - the maximum length of this array, use -1 for no max length - `int`

  returns: an integer array Property object with all settings defined - `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^Configuration this ^java.lang.String category ^java.lang.String key default-values ^java.lang.String comment ^Integer min-value ^Integer max-value ^Boolean is-list-length-fixed ^Integer max-list-length]
    (-> this (.get category key default-values comment min-value max-value is-list-length-fixed max-list-length)))
  (^net.minecraftforge.common.config.Property [^Configuration this ^java.lang.String category ^java.lang.String key default-values ^java.lang.String comment ^Boolean is-list-length-fixed ^Integer max-list-length ^java.util.regex.Pattern validation-pattern]
    (-> this (.get category key default-values comment is-list-length-fixed max-list-length validation-pattern)))
  (^net.minecraftforge.common.config.Property [^Configuration this ^java.lang.String category ^java.lang.String key default-values ^java.lang.String comment ^Boolean is-list-length-fixed ^Integer max-list-length]
    (-> this (.get category key default-values comment is-list-length-fixed max-list-length)))
  (^net.minecraftforge.common.config.Property [^Configuration this ^java.lang.String category ^java.lang.String key ^java.lang.String default-value ^java.lang.String comment ^java.util.regex.Pattern validation-pattern]
    (-> this (.get category key default-value comment validation-pattern)))
  (^net.minecraftforge.common.config.Property [^Configuration this ^java.lang.String category ^java.lang.String key ^Boolean default-value ^java.lang.String comment]
    (-> this (.get category key default-value comment)))
  (^net.minecraftforge.common.config.Property [^Configuration this ^java.lang.String category ^java.lang.String key ^Boolean default-value]
    (-> this (.get category key default-value))))

