(ns net.minecraft.entity.SharedMonsterAttributes
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.entity SharedMonsterAttributes]))

(defn ->shared-monster-attributes
  "Constructor."
  (^SharedMonsterAttributes []
    (new SharedMonsterAttributes )))

(def *-max-health
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/MAX_HEALTH)

(def *-follow-range
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/FOLLOW_RANGE)

(def *-knockback-resistance
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/KNOCKBACK_RESISTANCE)

(def *-movement-speed
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/MOVEMENT_SPEED)

(def *-attack-damage
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/ATTACK_DAMAGE)

(def *-attack-speed
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/ATTACK_SPEED)

(def *-armor
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/ARMOR)

(def *-armor-toughness
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/ARMOR_TOUGHNESS)

(def *-luck
  "Static Constant.

  type: net.minecraft.entity.ai.attributes.IAttribute"
  SharedMonsterAttributes/LUCK)

(defn *write-base-attribute-map-to-nbt
  "map - `net.minecraft.entity.ai.attributes.AbstractAttributeMap`

  returns: `net.minecraft.nbt.NBTTagList`"
  (^net.minecraft.nbt.NBTTagList [^net.minecraft.entity.ai.attributes.AbstractAttributeMap map]
    (SharedMonsterAttributes/writeBaseAttributeMapToNBT map)))

(defn *write-attribute-modifier-to-nbt
  "modifier - `net.minecraft.entity.ai.attributes.AttributeModifier`

  returns: `net.minecraft.nbt.NBTTagCompound`"
  (^net.minecraft.nbt.NBTTagCompound [^net.minecraft.entity.ai.attributes.AttributeModifier modifier]
    (SharedMonsterAttributes/writeAttributeModifierToNBT modifier)))

(defn *set-attribute-modifiers
  "map - `net.minecraft.entity.ai.attributes.AbstractAttributeMap`
  list - `net.minecraft.nbt.NBTTagList`"
  ([^net.minecraft.entity.ai.attributes.AbstractAttributeMap map ^net.minecraft.nbt.NBTTagList list]
    (SharedMonsterAttributes/setAttributeModifiers map list)))

(defn *read-attribute-modifier-from-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`

  returns: `net.minecraft.entity.ai.attributes.AttributeModifier`"
  (^net.minecraft.entity.ai.attributes.AttributeModifier [^net.minecraft.nbt.NBTTagCompound compound]
    (SharedMonsterAttributes/readAttributeModifierFromNBT compound)))

