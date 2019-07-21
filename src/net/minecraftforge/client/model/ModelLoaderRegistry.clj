(ns net.minecraftforge.client.model.ModelLoaderRegistry
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ModelLoaderRegistry]))

(defn ->model-loader-registry
  "Constructor."
  (^ModelLoaderRegistry []
    (new ModelLoaderRegistry )))

(defn *clear-model-cache
  "manager - `net.minecraft.client.resources.IResourceManager`"
  ([^net.minecraft.client.resources.IResourceManager manager]
    (ModelLoaderRegistry/clearModelCache manager)))

(defn *loaded
  "location - `net.minecraft.util.ResourceLocation`

  returns: `boolean`"
  (^Boolean [^net.minecraft.util.ResourceLocation location]
    (ModelLoaderRegistry/loaded location)))

(defn *get-actual-location
  "location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraft.util.ResourceLocation`"
  (^net.minecraft.util.ResourceLocation [^net.minecraft.util.ResourceLocation location]
    (ModelLoaderRegistry/getActualLocation location)))

(defn *get-missing-model
  "returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel []
    (ModelLoaderRegistry/getMissingModel )))

(defn *get-model-or-missing
  "Use this if you don't care about the exception and want some model anyway.

  location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^net.minecraft.util.ResourceLocation location]
    (ModelLoaderRegistry/getModelOrMissing location)))

(defn *load-asm
  "location - `net.minecraft.util.ResourceLocation`
  custom-parameters - `com.google.common.collect.ImmutableMap`

  returns: `net.minecraftforge.common.model.animation.IAnimationStateMachine`"
  (^net.minecraftforge.common.model.animation.IAnimationStateMachine [^net.minecraft.util.ResourceLocation location ^com.google.common.collect.ImmutableMap custom-parameters]
    (ModelLoaderRegistry/loadASM location custom-parameters)))

(defn *register-loader
  "loader - `net.minecraftforge.client.model.ICustomModelLoader`"
  ([^net.minecraftforge.client.model.ICustomModelLoader loader]
    (ModelLoaderRegistry/registerLoader loader)))

(defn *get-model
  "Primary method to get IModel instances.
   ResourceLocation argument will be passed directly to the custom model loaders,
   ModelResourceLocation argument will be loaded through the blockstate system.

  location - `net.minecraft.util.ResourceLocation`

  returns: `net.minecraftforge.client.model.IModel`

  throws: java.lang.Exception"
  (^net.minecraftforge.client.model.IModel [^net.minecraft.util.ResourceLocation location]
    (ModelLoaderRegistry/getModel location)))

(defn *get-model-or-log-error
  "Use this if you want the model, but need to log the error.

  location - `net.minecraft.util.ResourceLocation`
  error - `java.lang.String`

  returns: `net.minecraftforge.client.model.IModel`"
  (^net.minecraftforge.client.model.IModel [^net.minecraft.util.ResourceLocation location ^java.lang.String error]
    (ModelLoaderRegistry/getModelOrLogError location error)))

