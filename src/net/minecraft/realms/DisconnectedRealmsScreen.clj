(ns net.minecraft.realms.DisconnectedRealmsScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms DisconnectedRealmsScreen]))

(defn ->disconnected-realms-screen
  "Constructor.

  parent-in - `net.minecraft.realms.RealmsScreen`
  unlocalized-title - `java.lang.String`
  reason-in - `net.minecraft.util.text.ITextComponent`"
  (^DisconnectedRealmsScreen [^net.minecraft.realms.RealmsScreen parent-in ^java.lang.String unlocalized-title ^net.minecraft.util.text.ITextComponent reason-in]
    (new DisconnectedRealmsScreen parent-in unlocalized-title reason-in)))

(defn init
  ""
  ([^DisconnectedRealmsScreen this]
    (-> this (.init))))

(defn key-pressed
  "p-key-pressed-1 - `char`
  p-key-pressed-2 - `int`"
  ([^DisconnectedRealmsScreen this ^Character p-key-pressed-1 ^Integer p-key-pressed-2]
    (-> this (.keyPressed p-key-pressed-1 p-key-pressed-2))))

(defn button-clicked
  "p-button-clicked-1 - `net.minecraft.realms.RealmsButton`"
  ([^DisconnectedRealmsScreen this ^net.minecraft.realms.RealmsButton p-button-clicked-1]
    (-> this (.buttonClicked p-button-clicked-1))))

(defn render
  "p-render-1 - `int`
  p-render-2 - `int`
  p-render-3 - `float`"
  ([^DisconnectedRealmsScreen this ^Integer p-render-1 ^Integer p-render-2 ^Float p-render-3]
    (-> this (.render p-render-1 p-render-2 p-render-3))))

