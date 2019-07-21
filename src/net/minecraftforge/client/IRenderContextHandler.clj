(ns net.minecraftforge.client.IRenderContextHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client IRenderContextHandler]))

(defn before-render-context
  "Run before the specified rendering context."
  ([^IRenderContextHandler this]
    (-> this (.beforeRenderContext))))

(defn after-render-context
  "Run after the specified rendering context."
  ([^IRenderContextHandler this]
    (-> this (.afterRenderContext))))

