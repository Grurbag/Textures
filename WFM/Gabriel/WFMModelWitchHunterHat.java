// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelWitchHunterHat extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer hat;
	private final ModelRenderer hat2;
	private final ModelRenderer hat3;

	public WFMModelWitchHunterHat() {
		textureWidth = 70;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		hat = new ModelRenderer(this);
		hat.setRotationPoint(0.0F, -4.0F, 0.0F);
		head.addChild(hat);
		setRotationAngle(hat, 0.1309F, 0.0F, 0.0F);
		hat.cubeList.add(new ModelBox(hat, 15, 0, -9.0F, -1.5F, -9.0F, 18, 0, 18, 0.0F, false));

		hat2 = new ModelRenderer(this);
		hat2.setRotationPoint(0.0F, -4.0F, 0.0F);
		head.addChild(hat2);
		hat2.cubeList.add(new ModelBox(hat2, 32, 21, -4.0F, -4.0F, -4.0F, 8, 3, 8, 0.7F, false));

		hat3 = new ModelRenderer(this);
		hat3.setRotationPoint(0.0F, -4.0F, 0.0F);
		hat2.addChild(hat3);
		hat3.cubeList.add(new ModelBox(hat3, 0, 24, -3.0F, -3.0F, -3.0F, 6, 2, 6, 0.7F, false));
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