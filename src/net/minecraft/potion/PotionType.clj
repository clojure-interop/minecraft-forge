(ns net.minecraft.potion.PotionType
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.potion PotionType]))

(defn ->potion-type
  "Constructor.

  p-i-46740-1 - `java.lang.String`
  p-i-46740-2 - `net.minecraft.potion.PotionEffect`"
  (^PotionType [^java.lang.String p-i-46740-1 ^net.minecraft.potion.PotionEffect p-i-46740-2]
    (new PotionType p-i-46740-1 p-i-46740-2))
  (^PotionType [^net.minecraft.potion.PotionEffect p-i-46739-1]
    (new PotionType p-i-46739-1)))

(def *-registry
  "Static Constant.

  type: net.minecraft.util.registry.RegistryNamespacedDefaultedByKey<net.minecraft.util.ResourceLocation,net.minecraft.potion.PotionType>"
  PotionType/REGISTRY)

(defn *get-potion-type-for-name
  "p-185168-0 - `java.lang.String`

  returns: `net.minecraft.potion.PotionType`"
  (^net.minecraft.potion.PotionType [^java.lang.String p-185168-0]
    (PotionType/getPotionTypeForName p-185168-0)))

(defn *register-potion-types
  ""
  ([]
    (PotionType/registerPotionTypes )))

(defn get-name-prefixed
  "p-185174-1 - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^PotionType this ^java.lang.String p-185174-1]
    (-> this (.getNamePrefixed p-185174-1))))

(defn get-effects
  "returns: `java.util.List<net.minecraft.potion.PotionEffect>`"
  (^java.util.List [^PotionType this]
    (-> this (.getEffects))))

(defn has-instant-effect?
  "returns: `boolean`"
  (^Boolean [^PotionType this]
    (-> this (.hasInstantEffect))))

