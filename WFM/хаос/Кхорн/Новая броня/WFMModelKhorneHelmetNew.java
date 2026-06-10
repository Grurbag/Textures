// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelKhorneHelmetNew extends ModelBase {
	private final ModelRenderer Head;

	public WFMModelKhorneHelmetNew() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.75F, false));
		Head.cubeList.add(new ModelBox(Head, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 16, -4.5F, -9.0F, -5.5F, 9, 10, 0, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 55, -4.0F, -10.0F, -4.0F, 8, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 42, -1.0F, -11.0F, -4.0F, 2, 1, 8, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 0, 54, -1.0F, -10.0F, -6.0F, 2, 5, 2, 0.0F, false));
		Head.cubeList.add(new ModelBox(Head, 44, 16, 5.0F, -18.0F, -2.5F, 5, 6, 5, -0.5F, false));
		Head.cubeList.add(new ModelBox(Head, 44, 16, -10.0F, -18.0F, -2.5F, 5, 6, 5, -0.5F, false));
		Head.cubeList.add(new ModelBox(Head, 22, 31, -10.5F, -23.0F, 0.0F, 21, 20, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}