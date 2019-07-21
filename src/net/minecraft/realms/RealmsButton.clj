(ns net.minecraft.realms.RealmsButton
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms RealmsButton]))

(defn ->realms-button
  "Constructor.

  button-id - `int`
  x - `int`
  y - `int`
  width-in - `int`
  height-in - `int`
  text - `java.lang.String`"
  (^RealmsButton [^Integer button-id ^Integer x ^Integer y ^Integer width-in ^Integer height-in ^java.lang.String text]
    (new RealmsButton button-id x y width-in height-in text))
  (^RealmsButton [^Integer button-id ^Integer x ^Integer y ^java.lang.String text]
    (new RealmsButton button-id x y text)))

(defn render-bg
  "p-render-bg-1 - `int`
  p-render-bg-2 - `int`"
  ([^RealmsButton this ^Integer p-render-bg-1 ^Integer p-render-bg-2]
    (-> this (.renderBg p-render-bg-1 p-render-bg-2))))

(defn get-width
  "returns: `int`"
  (^Integer [^RealmsButton this]
    (-> this (.getWidth))))

(defn released
  "p-released-1 - `int`
  p-released-2 - `int`"
  ([^RealmsButton this ^Integer p-released-1 ^Integer p-released-2]
    (-> this (.released p-released-1 p-released-2))))

(defn blit
  "p-blit-1 - `int`
  p-blit-2 - `int`
  p-blit-3 - `int`
  p-blit-4 - `int`
  p-blit-5 - `int`
  p-blit-6 - `int`"
  ([^RealmsButton this ^Integer p-blit-1 ^Integer p-blit-2 ^Integer p-blit-3 ^Integer p-blit-4 ^Integer p-blit-5 ^Integer p-blit-6]
    (-> this (.blit p-blit-1 p-blit-2 p-blit-3 p-blit-4 p-blit-5 p-blit-6))))

(defn msg
  "p-msg-1 - `java.lang.String`"
  ([^RealmsButton this ^java.lang.String p-msg-1]
    (-> this (.msg p-msg-1))))

(defn id
  "returns: `int`"
  (^Integer [^RealmsButton this]
    (-> this (.id))))

(defn clicked
  "p-clicked-1 - `int`
  p-clicked-2 - `int`"
  ([^RealmsButton this ^Integer p-clicked-1 ^Integer p-clicked-2]
    (-> this (.clicked p-clicked-1 p-clicked-2))))

(defn get-proxy
  "returns: `net.minecraft.client.gui.GuiButton`"
  (^net.minecraft.client.gui.GuiButton [^RealmsButton this]
    (-> this (.getProxy))))

(defn get-height
  "returns: `int`"
  (^Integer [^RealmsButton this]
    (-> this (.getHeight))))

(defn get-y-image
  "p-get-y-image-1 - `boolean`

  returns: `int`"
  (^Integer [^RealmsButton this ^Boolean p-get-y-image-1]
    (-> this (.getYImage p-get-y-image-1))))

(defn render
  "p-render-1 - `int`
  p-render-2 - `int`"
  ([^RealmsButton this ^Integer p-render-1 ^Integer p-render-2]
    (-> this (.render p-render-1 p-render-2))))

(defn y
  "returns: `int`"
  (^Integer [^RealmsButton this]
    (-> this (.y))))

(defn active
  "p-active-1 - `boolean`"
  ([^RealmsButton this ^Boolean p-active-1]
    (-> this (.active p-active-1)))
  (^Boolean [^RealmsButton this]
    (-> this (.active))))

