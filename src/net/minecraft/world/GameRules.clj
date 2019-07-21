(ns net.minecraft.world.GameRules
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world GameRules]))

(defn ->game-rules
  "Constructor."
  (^GameRules []
    (new GameRules )))

(defn write-to-nbt
  "returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^GameRules this]
    (-> this (.writeToNBT))))

(defn read-from-nbt
  "nbt - `net.minecraft.nbt.NBTTagCompound`"
  ([^GameRules this ^net.minecraft.nbt.NBTTagCompound nbt]
    (-> this (.readFromNBT nbt))))

(defn has-rule?
  "name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^GameRules this ^java.lang.String name]
    (-> this (.hasRule name))))

(defn get-string
  "name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^GameRules this ^java.lang.String name]
    (-> this (.getString name))))

(defn get-rules
  "returns: `java.lang.String[]`"
  ([^GameRules this]
    (-> this (.getRules))))

(defn get-int
  "name - `java.lang.String`

  returns: `int`"
  (^Integer [^GameRules this ^java.lang.String name]
    (-> this (.getInt name))))

(defn set-or-create-game-rule
  "key - `java.lang.String`
  rule-value - `java.lang.String`"
  ([^GameRules this ^java.lang.String key ^java.lang.String rule-value]
    (-> this (.setOrCreateGameRule key rule-value))))

(defn are-same-type
  "key - `java.lang.String`
  other-value - `net.minecraft.world.GameRules$ValueType`

  returns: `boolean`"
  (^Boolean [^GameRules this ^java.lang.String key ^net.minecraft.world.GameRules$ValueType other-value]
    (-> this (.areSameType key other-value))))

(defn get-boolean?
  "name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^GameRules this ^java.lang.String name]
    (-> this (.getBoolean name))))

(defn add-game-rule
  "key - `java.lang.String`
  value - `java.lang.String`
  type - `net.minecraft.world.GameRules$ValueType`"
  ([^GameRules this ^java.lang.String key ^java.lang.String value ^net.minecraft.world.GameRules$ValueType type]
    (-> this (.addGameRule key value type))))

