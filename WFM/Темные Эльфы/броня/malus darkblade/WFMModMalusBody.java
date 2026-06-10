// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer body2;
	private final ModelRenderer body3;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 0.0F, 0.0F);
		body.cubeList.add(new ModelBox(body, 40, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F, false));

		body2 = new ModelRenderer(this);
		body2.setRotationPoint(-6.0F, -3.0F, -2.0F);
		body.addChild(body2);
		setRotationAngle(body2, -0.3491F, 0.0F, 0.0F);
		body2.cubeList.add(new ModelBox(body2, 44, 0, -6.0F, -6.0F, 0.5F, 10, 12, 0, 0.0F, false));

		body3 = new ModelRenderer(this);
		body3.setRotationPoint(1.0F, 5.0F, 4.0F);
		body.addChild(body3);
		setRotationAngle(body3, 0.1745F, 0.0F, 0.0F);
		body3.cubeList.add(new ModelBox(body3, 0, 0, -7.0F, -6.0F, -0.5F, 12, 24, 0, 0.0F, false));
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