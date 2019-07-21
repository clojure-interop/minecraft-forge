(ns net.minecraftforge.fml.client.config.GuiCheckBox
  "This class provides a checkbox style control."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiCheckBox]))

(defn ->gui-check-box
  "Constructor.

  id - `int`
  x-pos - `int`
  y-pos - `int`
  display-string - `java.lang.String`
  is-checked - `boolean`"
  (^GuiCheckBox [^Integer id ^Integer x-pos ^Integer y-pos ^java.lang.String display-string ^Boolean is-checked]
    (new GuiCheckBox id x-pos y-pos display-string is-checked)))

(defn draw-button
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`"
  ([^GuiCheckBox this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.drawButton mc mouse-x mouse-y))))

(defn mouse-pressed
  "mc - `net.minecraft.client.Minecraft`
  mouse-x - `int`
  mouse-y - `int`

  returns: `boolean`"
  (^Boolean [^GuiCheckBox this ^net.minecraft.client.Minecraft mc ^Integer mouse-x ^Integer mouse-y]
    (-> this (.mousePressed mc mouse-x mouse-y))))

(defn checked?
  "returns: `boolean`"
  (^Boolean [^GuiCheckBox this]
    (-> this (.isChecked))))

(defn set-is-checked
  "is-checked - `boolean`"
  ([^GuiCheckBox this ^Boolean is-checked]
    (-> this (.setIsChecked is-checked))))

