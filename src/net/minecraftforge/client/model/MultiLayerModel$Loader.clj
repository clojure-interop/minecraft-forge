(ns net.minecraftforge.client.model.MultiLayerModel$Loader
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model MultiLayerModel$Loader]))

(def INSTANCE
  "Enum Constant.

  type: net.minecraftforge.client.model.MultiLayerModel$Loader"
  MultiLayerModel$Loader/INSTANCE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (MultiLayerModel.Loader c : MultiLayerModel.Loader.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `net.minecraftforge.client.model.MultiLayerModel$Loader[]`"
  ([]
    (MultiLayerModel$Loader/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `net.minecraftforge.client.model.MultiLayerModel$Loader`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^net.minecraftforge.client.model.MultiLayerModel$Loader [^java.lang.String name]
    (MultiLayerModel$Loader/valueOf name)))

(defn on-resource-manager-reload
  "resource-manager - `net.minecraft.client.resources.IResourceManager`"
  ([^MultiLayerModel$Loader this ^net.minecraft.client.resources.IResourceManager resource-manager]
    (-> this (.onResourceManagerReload resource-manager))))

(defn accepts
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^MultiLayerModel$Loader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.accepts model-location))))

(defn load-model
  "model-location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^MultiLayerModel$Loader this ^net.minecraft.util.ResourceLocation model-location]
    (-> this (.loadModel model-location))))

