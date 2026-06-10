// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelWoodElfLordCape extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer cape;

	public WFMModelWoodElfLordCape() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 40, 16, -5.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(1.0F, 11.0F, 5.0F);
		body.addChild(cape);
		setRotationAngle(cape, 0.2618F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 0, 0, -9.5F, -12.0F, 0.0F, 15, 24, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}