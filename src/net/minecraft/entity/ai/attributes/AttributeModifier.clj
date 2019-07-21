(ns net.minecraft.entity.ai.attributes.AttributeModifier
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai.attributes AttributeModifier]))

(defn ->attribute-modifier
  "Constructor.

  id-in - `java.util.UUID`
  name-in - `java.lang.String`
  amount-in - `double`
  operation-in - `int`"
  (^AttributeModifier [^java.util.UUID id-in ^java.lang.String name-in ^Double amount-in ^Integer operation-in]
    (new AttributeModifier id-in name-in amount-in operation-in))
  (^AttributeModifier [^java.lang.String name-in ^Double amount-in ^Integer operation-in]
    (new AttributeModifier name-in amount-in operation-in)))

(defn set-saved
  "saved - `boolean`

  returns: `net.minecraft.entity.ai.attributes.AttributeModifier`"
  (^net.minecraft.entity.ai.attributes.AttributeModifier [^AttributeModifier this ^Boolean saved]
    (-> this (.setSaved saved))))

(defn get-amount
  "returns: `double`"
  (^Double [^AttributeModifier this]
    (-> this (.getAmount))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AttributeModifier this]
    (-> this (.toString))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^AttributeModifier this]
    (-> this (.getName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AttributeModifier this]
    (-> this (.hashCode))))

(defn get-id
  "returns: `java.util.UUID`"
  (^java.util.UUID [^AttributeModifier this]
    (-> this (.getID))))

(defn get-operation
  "returns: `int`"
  (^Integer [^AttributeModifier this]
    (-> this (.getOperation))))

(defn saved?
  "returns: `boolean`"
  (^Boolean [^AttributeModifier this]
    (-> this (.isSaved))))

(defn equals
  "p-equals-1 - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AttributeModifier this ^java.lang.Object p-equals-1]
    (-> this (.equals p-equals-1))))

