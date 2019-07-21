(ns net.minecraft.client.renderer.vertex.DefaultVertexFormats
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.client.renderer.vertex DefaultVertexFormats]))

(defn ->default-vertex-formats
  "Constructor."
  (^DefaultVertexFormats []
    (new DefaultVertexFormats )))

(def *-block
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/BLOCK)

(def *-item
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/ITEM)

(def *-oldmodel-position-tex-normal
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/OLDMODEL_POSITION_TEX_NORMAL)

(def *-particle-position-tex-color-lmap
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/PARTICLE_POSITION_TEX_COLOR_LMAP)

(def *-position
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/POSITION)

(def *-position-color
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/POSITION_COLOR)

(def *-position-tex
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/POSITION_TEX)

(def *-position-normal
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/POSITION_NORMAL)

(def *-position-tex-color
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/POSITION_TEX_COLOR)

(def *-position-tex-normal
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/POSITION_TEX_NORMAL)

(def *-position-tex-lmap-color
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/POSITION_TEX_LMAP_COLOR)

(def *-position-tex-color-normal
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormat"
  DefaultVertexFormats/POSITION_TEX_COLOR_NORMAL)

(def *-position-3-f
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement"
  DefaultVertexFormats/POSITION_3F)

(def *-color-4-ub
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement"
  DefaultVertexFormats/COLOR_4UB)

(def *-tex-2-f
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement"
  DefaultVertexFormats/TEX_2F)

(def *-tex-2-s
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement"
  DefaultVertexFormats/TEX_2S)

(def *-normal-3-b
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement"
  DefaultVertexFormats/NORMAL_3B)

(def *-padding-1-b
  "Static Constant.

  type: net.minecraft.client.renderer.vertex.VertexFormatElement"
  DefaultVertexFormats/PADDING_1B)

