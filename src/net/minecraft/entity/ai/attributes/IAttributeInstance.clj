(ns net.minecraft.entity.ai.attributes.IAttributeInstance
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai.attributes IAttributeInstance]))

(defn get-modifiers-by-operation
  "operation - `int`

  returns: `java.util.Collection<net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^java.util.Collection [^IAttributeInstance this ^Integer operation]
    (-> this (.getModifiersByOperation operation))))

(defn remove-all-modifiers
  ""
  ([^IAttributeInstance this]
    (-> this (.removeAllModifiers))))

(defn has-modifier?
  "modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`

  returns: `boolean`"
  (^Boolean [^IAttributeInstance this ^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (-> this (.hasModifier modifier))))

(defn get-modifiers
  "returns: `java.util.Collection<net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^java.util.Collection [^IAttributeInstance this]
    (-> this (.getModifiers))))

(defn apply-modifier
  "modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`"
  ([^IAttributeInstance this ^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (-> this (.applyModifier modifier))))

(defn get-attribute
  "returns: `net.minecraft.entity.ai.attributes.IAttribute`"
  (^net.minecraft.entity.ai.attributes.IAttribute [^IAttributeInstance this]
    (-> this (.getAttribute))))

(defn set-base-value
  "base-value - `double`"
  ([^IAttributeInstance this ^Double base-value]
    (-> this (.setBaseValue base-value))))

(defn remove-modifier
  "modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`"
  ([^IAttributeInstance this ^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (-> this (.removeModifier modifier))))

(defn get-attribute-value
  "returns: `double`"
  (^Double [^IAttributeInstance this]
    (-> this (.getAttributeValue))))

(defn get-modifier
  "uuid - `java.util.UUID`

  returns: `net.minecraft.entity.ai.attributes.AttributeModifier`"
  (^net.minecraft.entity.ai.attributes.AttributeModifier [^IAttributeInstance this ^java.util.UUID uuid]
    (-> this (.getModifier uuid))))

(defn get-base-value
  "returns: `double`"
  (^Double [^IAttributeInstance this]
    (-> this (.getBaseValue))))

