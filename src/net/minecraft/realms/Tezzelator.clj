(ns net.minecraft.realms.Tezzelator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.realms Tezzelator]))

(defn ->tezzelator
  "Constructor."
  (^Tezzelator []
    (new Tezzelator )))

(defn *-t
  "Static Field.

  type: net.minecraft.client.renderer.Tessellator"
  []
  Tezzelator/t)

(def *-instance
  "Static Constant.

  type: net.minecraft.realms.Tezzelator"
  Tezzelator/instance)

(defn tex-2
  "p-tex-2-1 - `short`
  p-tex-2-2 - `short`"
  ([^Tezzelator this ^Short p-tex-2-1 ^Short p-tex-2-2]
    (-> this (.tex2 p-tex-2-1 p-tex-2-2))))

(defn begin
  "p-begin-1 - `int`
  p-begin-2 - `net.minecraft.realms.RealmsVertexFormat`"
  ([^Tezzelator this ^Integer p-begin-1 ^net.minecraft.realms.RealmsVertexFormat p-begin-2]
    (-> this (.begin p-begin-1 p-begin-2))))

(defn offset
  "p-offset-1 - `double`
  p-offset-3 - `double`
  p-offset-5 - `double`"
  ([^Tezzelator this ^Double p-offset-1 ^Double p-offset-3 ^Double p-offset-5]
    (-> this (.offset p-offset-1 p-offset-3 p-offset-5))))

(defn normal
  "p-normal-1 - `float`
  p-normal-2 - `float`
  p-normal-3 - `float`"
  ([^Tezzelator this ^Float p-normal-1 ^Float p-normal-2 ^Float p-normal-3]
    (-> this (.normal p-normal-1 p-normal-2 p-normal-3))))

(defn end-vertex
  ""
  ([^Tezzelator this]
    (-> this (.endVertex))))

(defn vertex
  "p-vertex-1 - `double`
  p-vertex-3 - `double`
  p-vertex-5 - `double`

  returns: `net.minecraft.realms.Tezzelator`"
  (^net.minecraft.realms.Tezzelator [^Tezzelator this ^Double p-vertex-1 ^Double p-vertex-3 ^Double p-vertex-5]
    (-> this (.vertex p-vertex-1 p-vertex-3 p-vertex-5))))

(defn color
  "p-color-1 - `float`
  p-color-2 - `float`
  p-color-3 - `float`
  p-color-4 - `float`"
  ([^Tezzelator this ^Float p-color-1 ^Float p-color-2 ^Float p-color-3 ^Float p-color-4]
    (-> this (.color p-color-1 p-color-2 p-color-3 p-color-4))))

(defn end
  ""
  ([^Tezzelator this]
    (-> this (.end))))

(defn tex
  "p-tex-1 - `double`
  p-tex-3 - `double`

  returns: `net.minecraft.realms.Tezzelator`"
  (^net.minecraft.realms.Tezzelator [^Tezzelator this ^Double p-tex-1 ^Double p-tex-3]
    (-> this (.tex p-tex-1 p-tex-3))))

