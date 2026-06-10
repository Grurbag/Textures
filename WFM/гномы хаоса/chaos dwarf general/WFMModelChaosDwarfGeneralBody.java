// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer banner;
	private final ModelRenderer banner2;
	private final ModelRenderer banner3;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		banner = new ModelRenderer(this);
		banner.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.addChild(banner);
		setRotationAngle(banner, -0.2618F, 0.0F, 0.0F);
		banner.cubeList.add(new ModelBox(banner, 0, 0, -8.0F, -34.0F, -3.0F, 16, 16, 0, 0.0F, false));

		banner2 = new ModelRenderer(this);
		banner2.setRotationPoint(0.0F, 0.0F, 0.0F);
		banner.addChild(banner2);
		setRotationAngle(banner2, 0.0F, -1.5708F, 0.0F);
		banner2.cubeList.add(new ModelBox(banner2, 32, 0, -3.0F, -32.0F, -6.0F, 16, 16, 0, 0.0F, false));

		banner3 = new ModelRenderer(this);
		banner3.setRotationPoint(-9.0F, 0.0F, 5.0F);
		banner.addChild(banner3);
		setRotationAngle(banner3, 0.0F, -1.5708F, 0.0F);
		banner3.cubeList.add(new ModelBox(banner3, 32, 0, -8.0F, -32.0F, -3.0F, 16, 16, 0, 0.0F, false));
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