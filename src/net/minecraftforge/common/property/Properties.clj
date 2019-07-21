(ns net.minecraftforge.common.property.Properties
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.property Properties]))

(defn ->properties
  "Constructor."
  (^Properties []
    (new Properties )))

(def *-static-property
  "Static Constant.

  Property indicating if the model should be rendered in the static renderer or in the TESR. AnimationTESR sets it to false.

  type: net.minecraft.block.properties.PropertyBool"
  Properties/StaticProperty)

(def *-animation-property
  "Static Constant.

  Property holding the IModelState used for animating the model in the TESR.

  type: net.minecraftforge.common.property.IUnlistedProperty<net.minecraftforge.common.model.IModelState>"
  Properties/AnimationProperty)

(defn *to-unlisted
  "property - `net.minecraft.block.properties.IProperty`

  returns: `<V extends java.lang.Comparable<V>> net.minecraftforge.common.property.IUnlistedProperty<V>`"
  ([^net.minecraft.block.properties.IProperty property]
    (Properties/toUnlisted property)))

