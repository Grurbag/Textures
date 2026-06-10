// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelNightGoblinHat extends ModelBase {
	private final ModelRenderer bipedHead;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer head4;
	private final ModelRenderer head5;

	public WFMModelNightGoblinHat() {
		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this);
		bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		bipedHead.cubeList.add(new ModelBox(bipedHead, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 1.1F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, -8.0F, 0.0F);
		bipedHead.addChild(head2);
		setRotationAngle(head2, 0.2618F, 0.0F, 0.0F);
		head2.cubeList.add(new ModelBox(head2, 0, 16, -3.5F, -4.0F, -3.5F, 7, 6, 7, 0.5F, false));

		head3 = new ModelRenderer(this);
		head3.setRotationPoint(-1.0F, -4.0F, 0.0F);
		head2.addChild(head3);
		setRotationAngle(head3, 0.2618F, 0.0F, 0.0F);
		head3.cubeList.add(new ModelBox(head3, 32, 17, -1.5F, -3.0F, -3.5F, 5, 5, 6, 0.5F, false));

		head4 = new ModelRenderer(this);
		head4.setRotationPoint(-1.0F, -4.0F, 0.0F);
		head3.addChild(head4);
		setRotationAngle(head4, 0.2618F, 0.0F, 0.0F);
		head4.cubeList.add(new ModelBox(head4, 32, 0, 0.5F, -3.0F, -3.5F, 3, 5, 4, 0.5F, false));

		head5 = new ModelRenderer(this);
		head5.setRotationPoint(0.0F, -4.0F, 0.0F);
		head4.addChild(head5);
		setRotationAngle(head5, 0.2618F, 0.0F, 0.0F);
		head5.cubeList.add(new ModelBox(head5, 33, 9, 1.0F, -3.0F, -3.5F, 2, 5, 3, 0.5F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bipedHead.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}