// Made with Blockbench 4.6.0
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat2;
	private final ModelRenderer hat3;
	private final ModelRenderer hat4;
	private final ModelRenderer hat5;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, -10.0F, -6.0F);
		head.addChild(hat);
		setRotationAngle(hat, 0.4194F, -0.7401F, -0.2921F);
		hat.cubeList.add(new ModelBox(hat, -10, 22, -5.4253F, 1.9074F, -5.4253F, 10, 0, 10, 0.0F, false));

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(-6.0F, -10.0F, 0.0F);
		head.addChild(hat2);
		setRotationAngle(hat2, 0.0F, -0.7854F, -0.3054F);
		hat2.cubeList.add(new ModelBox(hat2, 10, 22, -5.4253F, 1.9074F, -4.5747F, 10, 0, 10, 0.0F, false));

		hat3 = new ModelRenderer(this);
		hat3.setRotationPoint(0.0F, -10.0F, 6.0F);
		head.addChild(hat3);
		setRotationAngle(hat3, -0.4194F, -0.7401F, 0.2921F);
		hat3.cubeList.add(new ModelBox(hat3, 30, 22, -4.5747F, 1.9074F, -4.5747F, 10, 0, 10, 0.0F, false));

		hat4 = new ModelRenderer(this);
		hat4.setRotationPoint(6.0F, -10.0F, 0.0F);
		head.addChild(hat4);
		setRotationAngle(hat4, 0.0F, -0.7854F, 0.3054F);
		hat4.cubeList.add(new ModelBox(hat4, 34, 0, -4.5747F, 1.9074F, -5.4253F, 10, 0, 10, 0.0F, false));

		hat5 = new ModelRenderer(this);
		hat5.setRotationPoint(1.0F, -11.0F, -1.0F);
		head.addChild(hat5);
		hat5.cubeList.add(new ModelBox(hat5, 0, 0, -1.5F, 0.0F, 0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}