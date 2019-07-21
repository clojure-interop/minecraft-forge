(ns net.minecraft.entity.ai.attributes.ModifiableAttributeInstance
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity.ai.attributes ModifiableAttributeInstance]))

(defn ->modifiable-attribute-instance
  "Constructor.

  attribute-map-in - `net.minecraft.entity.ai.attributes.AbstractAttributeMap`
  generic-attribute-in - `net.minecraft.entity.ai.attributes.IAttribute`"
  (^ModifiableAttributeInstance [^net.minecraft.entity.ai.attributes.AbstractAttributeMap attribute-map-in ^net.minecraft.entity.ai.attributes.IAttribute generic-attribute-in]
    (new ModifiableAttributeInstance attribute-map-in generic-attribute-in)))

(defn get-modifiers-by-operation
  "operation - `int`

  returns: `java.util.Collection<net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^java.util.Collection [^ModifiableAttributeInstance this ^Integer operation]
    (-> this (.getModifiersByOperation operation))))

(defn remove-all-modifiers
  ""
  ([^ModifiableAttributeInstance this]
    (-> this (.removeAllModifiers))))

(defn has-modifier?
  "modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`

  returns: `boolean`"
  (^Boolean [^ModifiableAttributeInstance this ^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (-> this (.hasModifier modifier))))

(defn get-modifiers
  "returns: `java.util.Collection<net.minecraft.entity.ai.attributes.AttributeModifier>`"
  (^java.util.Collection [^ModifiableAttributeInstance this]
    (-> this (.getModifiers))))

(defn apply-modifier
  "modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`"
  ([^ModifiableAttributeInstance this ^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (-> this (.applyModifier modifier))))

(defn get-attribute
  "returns: `net.minecraft.entity.ai.attributes.IAttribute`"
  (^net.minecraft.entity.ai.attributes.IAttribute [^ModifiableAttributeInstance this]
    (-> this (.getAttribute))))

(defn set-base-value
  "base-value - `double`"
  ([^ModifiableAttributeInstance this ^Double base-value]
    (-> this (.setBaseValue base-value))))

(defn remove-modifier
  "modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`"
  ([^ModifiableAttributeInstance this ^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (-> this (.removeModifier modifier))))

(defn get-attribute-value
  "returns: `double`"
  (^Double [^ModifiableAttributeInstance this]
    (-> this (.getAttributeValue))))

(defn get-modifier
  "uuid - `java.util.UUID`

  returns: `net.minecraft.entity.ai.attributes.AttributeModifier`"
  (^net.minecraft.entity.ai.attributes.AttributeModifier [^ModifiableAttributeInstance this ^java.util.UUID uuid]
    (-> this (.getModifier uuid))))

(defn get-base-value
  "returns: `double`"
  (^Double [^ModifiableAttributeInstance this]
    (-> this (.getBaseValue))))

