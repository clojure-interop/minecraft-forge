(ns net.minecraftforge.client.model.ItemTextureQuadConverter
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.client.model ItemTextureQuadConverter]))

(defn *convert-texture
  "Takes a texture and converts it into BakedQuads.
   The conversion is done by scanning the texture horizontally and vertically and creating \"strips\" of the texture.
   Strips that are of the same size and follow each other are converted into one bigger quad.

   The resulting list of quads is the texture represented as a list of horizontal OR vertical quads,
   depending on which creates less quads. If the amount of quads is equal, horizontal is preferred.

  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  transform - `net.minecraftforge.common.model.TRSRTransformation`
  template - The input texture to convert - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  sprite - The texture whose UVs shall be used @return The generated quads. - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  z - `float`
  facing - `net.minecraft.util.EnumFacing`
  color - `int`

  returns: `java.util.List<net.minecraftforge.client.model.pipeline.UnpackedBakedQuad>`"
  (^java.util.List [^net.minecraft.client.renderer.vertex.VertexFormat format ^net.minecraftforge.common.model.TRSRTransformation transform ^net.minecraft.client.renderer.texture.TextureAtlasSprite template ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite ^Float z ^net.minecraft.util.EnumFacing facing ^Integer color]
    (ItemTextureQuadConverter/convertTexture format transform template sprite z facing color)))

(defn *convert-texture-horizontal
  "Scans a texture and converts it into a list of horizontal strips stacked on top of each other.
   The height of the strips is as big as possible.

  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  transform - `net.minecraftforge.common.model.TRSRTransformation`
  template - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  sprite - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  z - `float`
  facing - `net.minecraft.util.EnumFacing`
  color - `int`

  returns: `java.util.List<net.minecraftforge.client.model.pipeline.UnpackedBakedQuad>`"
  (^java.util.List [^net.minecraft.client.renderer.vertex.VertexFormat format ^net.minecraftforge.common.model.TRSRTransformation transform ^net.minecraft.client.renderer.texture.TextureAtlasSprite template ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite ^Float z ^net.minecraft.util.EnumFacing facing ^Integer color]
    (ItemTextureQuadConverter/convertTextureHorizontal format transform template sprite z facing color)))

(defn *convert-texture-vertical
  "Scans a texture and converts it into a list of vertical strips stacked next to each other from left to right.
   The width of the strips is as big as possible.

  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  transform - `net.minecraftforge.common.model.TRSRTransformation`
  template - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  sprite - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  z - `float`
  facing - `net.minecraft.util.EnumFacing`
  color - `int`

  returns: `java.util.List<net.minecraftforge.client.model.pipeline.UnpackedBakedQuad>`"
  (^java.util.List [^net.minecraft.client.renderer.vertex.VertexFormat format ^net.minecraftforge.common.model.TRSRTransformation transform ^net.minecraft.client.renderer.texture.TextureAtlasSprite template ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite ^Float z ^net.minecraft.util.EnumFacing facing ^Integer color]
    (ItemTextureQuadConverter/convertTextureVertical format transform template sprite z facing color)))

(defn *gen-quad
  "Generates a Front/Back quad for an itemmodel. Therefore only supports facing NORTH and SOUTH.
   Coordinates are [0,16] to match the usual coordinates used in TextureAtlasSprites

  format - `net.minecraft.client.renderer.vertex.VertexFormat`
  transform - `net.minecraftforge.common.model.TRSRTransformation`
  x-1 - `float`
  y-1 - `float`
  x-2 - `float`
  y-2 - `float`
  z - `float`
  sprite - `net.minecraft.client.renderer.texture.TextureAtlasSprite`
  facing - `net.minecraft.util.EnumFacing`
  color - `int`

  returns: `net.minecraftforge.client.model.pipeline.UnpackedBakedQuad`"
  (^net.minecraftforge.client.model.pipeline.UnpackedBakedQuad [^net.minecraft.client.renderer.vertex.VertexFormat format ^net.minecraftforge.common.model.TRSRTransformation transform ^Float x-1 ^Float y-1 ^Float x-2 ^Float y-2 ^Float z ^net.minecraft.client.renderer.texture.TextureAtlasSprite sprite ^net.minecraft.util.EnumFacing facing ^Integer color]
    (ItemTextureQuadConverter/genQuad format transform x-1 y-1 x-2 y-2 z sprite facing color)))

