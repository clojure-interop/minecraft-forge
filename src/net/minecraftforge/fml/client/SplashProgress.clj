(ns net.minecraftforge.fml.client.SplashProgress
  "Not a fully fleshed out API, may change in future MC versions.
  However feel free to use and suggest additions."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client SplashProgress]))

(defn ->splash-progress
  "Constructor."
  (^SplashProgress []
    (new SplashProgress )))

(defn *start
  ""
  ([]
    (SplashProgress/start )))

(defn *get-max-texture-size
  "returns: `int`"
  (^Integer []
    (SplashProgress/getMaxTextureSize )))

(defn *pause
  "Deprecated. not a stable API, will break, don't use this yet"
  ([]
    (SplashProgress/pause )))

(defn *resume
  "Deprecated. not a stable API, will break, don't use this yet"
  ([]
    (SplashProgress/resume )))

(defn *finish
  ""
  ([]
    (SplashProgress/finish )))

(defn *draw-vanilla-screen
  "render-engine - `net.minecraft.client.renderer.texture.TextureManager`

  throws: org.lwjgl.LWJGLException"
  ([^net.minecraft.client.renderer.texture.TextureManager render-engine]
    (SplashProgress/drawVanillaScreen render-engine)))

(defn *clear-vanilla-resources
  "render-engine - `net.minecraft.client.renderer.texture.TextureManager`
  mojang-logo - `net.minecraft.util.ResourceLocation`"
  ([^net.minecraft.client.renderer.texture.TextureManager render-engine ^net.minecraft.util.ResourceLocation mojang-logo]
    (SplashProgress/clearVanillaResources render-engine mojang-logo)))

(defn *check-gl-error
  "where - `java.lang.String`"
  ([^java.lang.String where]
    (SplashProgress/checkGLError where)))

