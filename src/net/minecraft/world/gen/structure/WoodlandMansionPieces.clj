(ns net.minecraft.world.gen.structure.WoodlandMansionPieces
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.world.gen.structure WoodlandMansionPieces]))

(defn ->woodland-mansion-pieces
  "Constructor."
  (^WoodlandMansionPieces []
    (new WoodlandMansionPieces )))

(defn *register-woodland-mansion-pieces
  ""
  ([]
    (WoodlandMansionPieces/registerWoodlandMansionPieces )))

(defn *generate-mansion
  "p-191152-0 - `net.minecraft.world.gen.structure.template.TemplateManager`
  p-191152-1 - `net.minecraft.util.math.BlockPos`
  p-191152-2 - `net.minecraft.util.Rotation`
  p-191152-3 - `java.util.List`
  p-191152-4 - `java.util.Random`"
  ([^net.minecraft.world.gen.structure.template.TemplateManager p-191152-0 ^net.minecraft.util.math.BlockPos p-191152-1 ^net.minecraft.util.Rotation p-191152-2 ^java.util.List p-191152-3 ^java.util.Random p-191152-4]
    (WoodlandMansionPieces/generateMansion p-191152-0 p-191152-1 p-191152-2 p-191152-3 p-191152-4)))

