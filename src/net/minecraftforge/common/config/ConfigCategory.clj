(ns net.minecraftforge.common.config.ConfigCategory
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.config ConfigCategory]))

(defn ->config-category
  "Constructor.

  name - `java.lang.String`
  parent - `net.minecraftforge.common.config.ConfigCategory`"
  (^ConfigCategory [^java.lang.String name ^net.minecraftforge.common.config.ConfigCategory parent]
    (new ConfigCategory name parent))
  (^ConfigCategory [^java.lang.String name]
    (new ConfigCategory name)))

(defn parent
  "Instance Constant.

  type: net.minecraftforge.common.config.ConfigCategory"
  (^net.minecraftforge.common.config.ConfigCategory [^ConfigCategory this]
    (-> this .-parent)))

(defn *get-qualified-name
  "name - `java.lang.String`
  parent - `net.minecraftforge.common.config.ConfigCategory`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String name ^net.minecraftforge.common.config.ConfigCategory parent]
    (ConfigCategory/getQualifiedName name parent)))

(defn get-config-entry-class
  "returns: `java.lang.Class<? extends net.minecraftforge.fml.client.config.GuiConfigEntries$IConfigEntry>`"
  ([^ConfigCategory this]
    (-> this (.getConfigEntryClass))))

(defn get-children
  "returns: `java.util.Set<net.minecraftforge.common.config.ConfigCategory>`"
  (^java.util.Set [^ConfigCategory this]
    (-> this (.getChildren))))

(defn values
  "returns: `java.util.Collection<net.minecraftforge.common.config.Property>`"
  (^java.util.Collection [^ConfigCategory this]
    (-> this (.values))))

(defn set-requires-mc-restart
  "Sets whether or not this ConfigCategory requires Minecraft to be restarted when changed.
   Defaults to false. Only set this flag to true if ALL child properties/categories require
   Minecraft to be restarted when changed. Setting this flag will also prevent modification
   of the child properties/categories while a world is running.

  requires-mc-restart - `boolean`

  returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^ConfigCategory this ^Boolean requires-mc-restart]
    (-> this (.setRequiresMcRestart requires-mc-restart))))

(defn put-all
  "m - `java.util.Map`"
  ([^ConfigCategory this ^java.util.Map m]
    (-> this (.putAll m))))

(defn set-comment
  "comment - `java.lang.String`"
  ([^ConfigCategory this ^java.lang.String comment]
    (-> this (.setComment comment))))

(defn get-values
  "returns: `java.util.Map<java.lang.String,net.minecraftforge.common.config.Property>`"
  (^java.util.Map [^ConfigCategory this]
    (-> this (.getValues))))

(defn put
  "key - `java.lang.String`
  value - `net.minecraftforge.common.config.Property`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^ConfigCategory this ^java.lang.String key ^net.minecraftforge.common.config.Property value]
    (-> this (.put key value))))

(defn get-ordered-values
  "returns: `java.util.List<net.minecraftforge.common.config.Property>`"
  (^java.util.List [^ConfigCategory this]
    (-> this (.getOrderedValues))))

(defn entry-set
  "returns: `java.util.Set<java.util.Map.Entry<java.lang.String,net.minecraftforge.common.config.Property>>`"
  (^java.util.Set [^ConfigCategory this]
    (-> this (.entrySet))))

(defn requires-mc-restart
  "Gets whether or not this ConfigCategory requires Minecraft to be restarted when changed.
   Defaults to false unless set to true.

  returns: `boolean`"
  (^Boolean [^ConfigCategory this]
    (-> this (.requiresMcRestart))))

(defn contains-value
  "value - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ConfigCategory this ^java.lang.Object value]
    (-> this (.containsValue value))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ConfigCategory this]
    (-> this (.getName))))

(defn show-in-gui
  "Gets whether or not this ConfigCategory should be allowed to show on config GUIs.
   Defaults to true unless set to false.

  returns: `boolean`"
  (^Boolean [^ConfigCategory this]
    (-> this (.showInGui))))

(defn get-first-parent
  "returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^ConfigCategory this]
    (-> this (.getFirstParent))))

(defn get-property-order
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^ConfigCategory this]
    (-> this (.getPropertyOrder))))

(defn remove
  "key - `java.lang.Object`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^ConfigCategory this ^java.lang.Object key]
    (-> this (.remove key))))

(defn requires-world-restart
  "Returns whether or not this category is able to be edited while a world is running using the in-game Mod Options screen
   as well as the Mods list screen, or only from the Mods list screen.

  returns: `boolean`"
  (^Boolean [^ConfigCategory this]
    (-> this (.requiresWorldRestart))))

(defn child?
  "returns: `boolean`"
  (^Boolean [^ConfigCategory this]
    (-> this (.isChild))))

(defn set-language-key
  "languagekey - `java.lang.String`

  returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^ConfigCategory this ^java.lang.String languagekey]
    (-> this (.setLanguageKey languagekey))))

(defn set-property-order
  "property-order - `java.util.List`

  returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^ConfigCategory this ^java.util.List property-order]
    (-> this (.setPropertyOrder property-order))))

(defn key-set
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set [^ConfigCategory this]
    (-> this (.keySet))))

(defn get-languagekey
  "returns: `java.lang.String`"
  (^java.lang.String [^ConfigCategory this]
    (-> this (.getLanguagekey))))

(defn get-comment
  "returns: `java.lang.String`"
  (^java.lang.String [^ConfigCategory this]
    (-> this (.getComment))))

(defn get-qualified-name
  "returns: `java.lang.String`"
  (^java.lang.String [^ConfigCategory this]
    (-> this (.getQualifiedName))))

(defn has-changed?
  "returns: `boolean`"
  (^Boolean [^ConfigCategory this]
    (-> this (.hasChanged))))

(defn empty?
  "returns: `boolean`"
  (^Boolean [^ConfigCategory this]
    (-> this (.isEmpty))))

(defn size
  "returns: `int`"
  (^Integer [^ConfigCategory this]
    (-> this (.size))))

(defn set-requires-world-restart
  "Sets the flag for whether or not this category can be edited while a world is running. Care should be taken to ensure
   that only properties that are truly dynamic can be changed from the in-game options menu. Only set this flag to
   true if all child properties/categories are unable to be modified while a world is running.

  requires-world-restart - `boolean`

  returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^ConfigCategory this ^Boolean requires-world-restart]
    (-> this (.setRequiresWorldRestart requires-world-restart))))

(defn clear
  ""
  ([^ConfigCategory this]
    (-> this (.clear))))

(defn contains-key
  "key - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^ConfigCategory this ^java.lang.String key]
    (-> this (.containsKey key))))

(defn remove-child
  "child - `net.minecraftforge.common.config.ConfigCategory`"
  ([^ConfigCategory this ^net.minecraftforge.common.config.ConfigCategory child]
    (-> this (.removeChild child))))

(defn write
  "out - `java.io.BufferedWriter`
  indent - `int`

  throws: java.io.IOException"
  ([^ConfigCategory this ^java.io.BufferedWriter out ^Integer indent]
    (-> this (.write out indent))))

(defn set-config-entry-class
  "clazz - `java.lang.Class`

  returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^ConfigCategory this ^java.lang.Class clazz]
    (-> this (.setConfigEntryClass clazz))))

(defn get
  "key - `java.lang.String`

  returns: `net.minecraftforge.common.config.Property`"
  (^net.minecraftforge.common.config.Property [^ConfigCategory this ^java.lang.String key]
    (-> this (.get key))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ConfigCategory this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn set-show-in-gui
  "Sets whether or not this ConfigCategory should be allowed to show on config GUIs.
   Defaults to true.

  show-in-gui - `boolean`

  returns: `net.minecraftforge.common.config.ConfigCategory`"
  (^net.minecraftforge.common.config.ConfigCategory [^ConfigCategory this ^Boolean show-in-gui]
    (-> this (.setShowInGui show-in-gui))))

