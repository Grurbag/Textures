// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer banner;
	private final ModelRenderer banner2;
	private final ModelRenderer cape;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		banner = new ModelRenderer(this);
		banner.setRotationPoint(0.0F, -12.0F, 4.0F);
		body.addChild(banner);
		setRotationAngle(banner, -0.1745F, 0.0F, 0.0F);
		banner.cubeList.add(new ModelBox(banner, 32, 0, -8.0F, -4.0F, 2.0F, 16, 16, 0, 0.0F, false));

		banner2 = new ModelRenderer(this);
		banner2.setRotationPoint(0.0F, 6.0F, 0.0F);
		banner.addChild(banner2);
		banner2.cubeList.add(new ModelBox(banner2, 39, 12, -1.0F, 6.0F, 2.0F, 2, 4, 0, 0.0F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 1.0F, 1.0F);
		body.addChild(cape);
		setRotationAngle(cape, 0.2182F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 0, 0, -7.0F, -1.0F, 2.0F, 14, 16, 0, 0.0F, false));
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