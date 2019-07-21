(ns net.minecraft.client.gui.GuiLabel
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.gui GuiLabel]))

(defn ->gui-label
  "Constructor.

  font-renderer-obj - `net.minecraft.client.gui.FontRenderer`
  p-i-45540-2 - `int`
  p-i-45540-3 - `int`
  p-i-45540-4 - `int`
  p-i-45540-5 - `int`
  p-i-45540-6 - `int`
  p-i-45540-7 - `int`"
  (^GuiLabel [^net.minecraft.client.gui.FontRenderer font-renderer-obj ^Integer p-i-45540-2 ^Integer p-i-45540-3 ^Integer p-i-45540-4 ^Integer p-i-45540-5 ^Integer p-i-45540-6 ^Integer p-i-45540-7]
    (new GuiLabel font-renderer-obj p-i-45540-2 p-i-45540-3 p-i-45540-4 p-i-45540-5 p-i-45540-6 p-i-45540-7)))

(defn x
  "Instance Field.

  type: int"
  (^Integer [^GuiLabel this]
    (-> this .-x)))

(defn y
  "Instance Field.

  type: int"
  (^Integer [^GuiLabel this]
    (-> this .-y)))

(defn id
  "Instance Field.

  type: int"
  (^Integer [^GuiLabel this]
    (-> this .-id)))

(defn visible
  "Instance Field.

  type: boolean"
  (^Boolean [^GuiLabel this]
    (-> this .-visible)))

(defn add-line
  "p-175202-1 - `java.lang.String`"
  ([^GuiLabel this ^java.lang.String p-175202-1]
    (-> this (.addLine p-175202-1))))

(defn set-centered
  "returns: `net.minecraft.client.gui.GuiLabel`"
  (^net.minecraft.client.gui.GuiLabel [^GuiLabel this]
    (-> this (.setCentered))))

(defn draw-label
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiLabel this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawLabel mc mouse-x mouse-y))))

